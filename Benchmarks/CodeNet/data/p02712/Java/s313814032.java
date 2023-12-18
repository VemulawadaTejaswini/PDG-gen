import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long ans = 0;
		
		for(int i = 1; i < n + 1; i++) {
			if((i % 3) == 0 || (i % 5) == 0) {
				ans += 0;
			}
			else {
				ans += i;
			}
		}
		
		System.out.println(ans);
	}

}
