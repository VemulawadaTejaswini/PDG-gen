import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int H[] = new int[N];
		int maxHeight = Integer.MIN_VALUE;
		int answer = 0;

		for (int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
			if (maxHeight <= H[i]) {
				maxHeight = Math.max(maxHeight, H[i]);
				answer++;
			}
		}

		System.out.println(answer);
	}
}
