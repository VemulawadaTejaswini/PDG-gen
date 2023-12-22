import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scan = new Scanner(System.in);
		long x = scan.nextLong();
		long p = 100;
		long ans = 0;
		
		while(true) {
			if(p < x) {
				p = p + (p/100);
				ans++;
			}
			else {
				break;
			}
		}
		
		System.out.println(ans);
		
	}

}
