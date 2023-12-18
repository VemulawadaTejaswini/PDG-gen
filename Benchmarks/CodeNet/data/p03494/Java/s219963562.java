import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] l = new int[N];
		for (int i = 0; i < N; i++) {
			l[i] = sc.nextInt();
		}

		int cnt = 0;
		while (true) {
			for (int i = 0; i < N; i++) {
				if (l[i] % 2 != 0) {
					System.out.println(cnt);
					return;
				}
				l[i] /= 2;
			}
			cnt++;
		}
	}
}