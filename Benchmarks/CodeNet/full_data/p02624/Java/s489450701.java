import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		long ans = 0;
		int tmp = 0;
		
		for(int i = 1; i < n+1; i++) {
			if(n % i == 0) {
				tmp++;
			}
			ans += (long)i * (long)tmp;
			System.out.println(ans);
		}
		
		System.out.print(ans);
	}

}
