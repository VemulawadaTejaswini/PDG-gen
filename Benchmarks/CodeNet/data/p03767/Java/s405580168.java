import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[3 * n];
		for(int i = 0 ; i < 3 * n ; i++) a[i] = sc.nextInt();
		Arrays.sort(a);
		long ans = 0;
		int[][] team = new int[n][3];
		for(int j = 0 ; j < 3 ; j++) {
			for(int i = 0 ; i < n ; i++) {
				team[i][j] = a[i + j * n];
			}
		}
		System.out.println(Arrays.deepToString(team));
		for(int i = 0 ; i < n ; i++) {
			int[] temp = Arrays.copyOf(team[i], team[i].length);
			Arrays.sort(temp);
			ans += temp[1];
		}
		System.out.println(ans);
	}
}
