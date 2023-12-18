import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int H[] = new int[N];
		for (int i = 0; i < H.length; i++) {
			H[i] = sc.nextInt();
		}
		int max = H[0];
		int cnt = 0;

		for (int i = 0; i < N; i++) {
			if (H[i] >= max) {
				cnt++;
				max = H[i];
			}
		}
		System.out.println(cnt);
	}
}
