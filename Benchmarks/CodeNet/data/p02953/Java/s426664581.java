import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int H[] = new int[N];
		boolean possible = true;

		for (int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
		}

		for (int i = 1; i < N; i++) {
			if (H[i] < H[i - 1]) {
				H[i - 1]--;
				if (H[i] < H[i - 1]) {
					possible = false;
					break;
				}
			}
		}

		if (possible) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
