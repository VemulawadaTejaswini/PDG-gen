
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int fr = 0;
		int ba = 0;
		int ans = 0;
		int[] list = new int[N + 1];
		for(int i = 1; i < N + 1; i++) {
			list[i] = sc.nextInt();
			fr += list[i];
		}
		ans = fr;
		for(int i = 1; i < N + 1; i++) {
			fr -= list[i];
			ba += list[i];
			if(Math.abs(fr - ba) < ans) {
				ans = fr - ba;
				if(i == N - 1) {
					System.out.println(ans);
					break;
				}
			} else {
				System.out.println(ans);
				break;
			}
		}
	}

}
