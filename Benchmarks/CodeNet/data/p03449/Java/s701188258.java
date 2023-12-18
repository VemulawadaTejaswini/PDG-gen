
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] sumup = new int[n + 1];
		int[] sumdown = new int[n + 1];
		sumup[0] = 0;
		sumdown[0] = 0;
		for(int i = 1; i < n + 1; i++) {
			sumup[i] = sc.nextInt() + sumup[i - 1];
		}
		for(int i = 1; i < n + 1; i++) {
			sumdown[i] = sc.nextInt() + sumdown[i - 1];
		}
		int ans = 0;
		for(int i = 1; i < n + 1; i++) {
			int tmp = sumup[i] + sumdown[n] - sumdown[i - 1];
			ans = Math.max(ans, tmp);
		}
		System.out.println(ans);
	}

}
