import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] a = new int[101][101];
		for(int i = 0; i < n; i++) {
			int kind = sc.nextInt();
			for(int j = 0; j < kind; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int[] count = new int[101];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= m; j++) {
				count[a[i][j]] ++;
			}
		}
		int ans = 0;
		for(int i = 1; i <= 100; i++) {
			if(count[i] == n) {
				ans ++;
			}
		}
		System.out.println(ans);
	}
}
