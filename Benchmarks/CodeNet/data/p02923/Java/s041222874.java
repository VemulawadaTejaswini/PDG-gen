import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] h = new int[N];
		for (int i = 0; i < N; i++)
			h[i] = sc.nextInt();
		int cnt = 0;
		int max = 0;
		for (int i = N - 1; i > 0; i--) {
			if (h[i] <= h[i-1]) cnt++;
			else cnt = 0;
			max = Math.max(max, cnt);
		}
		System.out.println(max);
	}
}
