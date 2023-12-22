import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		long a = scan.nextLong();
		long b = scan.nextLong();
		long c = scan.nextLong();
		long k = scan.nextLong();
		long ans = 0;
		
		if(k <= a) {
			ans = k;
		}
		else if(k <= a + b) {
			ans = a;
		}
		else {
			ans = a - (k - a - b);
		}
		
		
		System.out.println(ans);

	}

}
