import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		long x = scan.nextLong();
		long k = scan.nextLong();
		long d = scan.nextLong();
		scan.close();

		for(long i=0;i<k;i++) {
			if(0<=x) {
				x = x-d;
			}else {
				x = x+d;
			}
		}

		System.out.println(Math.abs(x));

	}

}
