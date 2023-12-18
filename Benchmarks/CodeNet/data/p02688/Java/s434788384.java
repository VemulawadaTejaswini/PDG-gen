import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		boolean[] ans = new boolean[n+1];
		
		for(int i = 0; i < k; i++) {
			int d = sc.nextInt();
			for(int m = 0; m < d; m++) {
				int a = sc.nextInt();
				ans[a] = true;
			}
		}
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			if(ans[i+1]==false) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}