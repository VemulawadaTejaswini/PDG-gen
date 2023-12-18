import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] data = new int[N];
		for (int i = 0; i < N; i++) {
			data[i] = sc.nextInt();
		}
		Arrays.sort(data);
		int c = 0;
		int cnt = 1;
		int ans = 0;
		for (int i = 0; i < N; i++) {
			if (N == 1) {
				ans += cnt;
			} else if (i == (N - 1)) {
				cnt++;
				if (cnt < c) {
					ans += cnt;
				} else {
					ans += (cnt - c);
				}
			} else if (c == 0) {
				c = data[i];
				cnt = 1;
			} else if (data[i] != c) {
				if (cnt < c) {
					ans += cnt;
				} else {
					ans += (cnt - c);
				}
				c = data[i];
				cnt = 1;
			} else {
				cnt++;
			}
		}
		System.out.println(ans);
		sc.close();
	}

}