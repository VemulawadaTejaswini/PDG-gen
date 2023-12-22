import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long total = 1;
		
		for(int i=0;i<a;i++) {
			long n = scan.nextLong();
			if(n == 0) {
				total = 0;
			}
			else {
				if(total <= ((long)Math.pow(10,18)/n)) {
					if(total >= 0) {
						total *= n;
					}
				}else {
					total = -1;
				}
			}
		}
		System.out.print(total);
		
	}

}