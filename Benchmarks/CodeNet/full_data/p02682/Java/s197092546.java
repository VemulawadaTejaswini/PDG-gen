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
		
		for(int i = 0; i < k; i++) {
			
			if(a > 0) {
				ans++;
				a--;
			}
			else if(b > 0) {
				b--;
			}
			else {
				ans--;
			}
		}
		
		System.out.println(ans);

	}

}
