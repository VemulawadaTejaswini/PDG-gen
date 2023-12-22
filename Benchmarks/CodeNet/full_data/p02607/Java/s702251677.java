import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++ ) {
			a[i] = scan.nextInt();
		}
		int ans = 0;
		for(int i = 1; i < n+1; i++) {
			if(i % 2 == 1 && a[i-1] % 2 == 1) {
				ans++;
			}
		}
		System.out.print(ans);
	}

}
