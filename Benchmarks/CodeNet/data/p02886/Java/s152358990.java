import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());

		int[] d = new int[N + 1];
		for(int i = 1;i <= N;i++) {
			d[i] = Integer.parseInt(sc.next());
		}

		sc.close();

		int sum = 0;
		for(int i = 1;i <= N - 1;i++) {
			for(int j = i + 1;j <= N;j++) {
				sum += d[i] * d[j];
			}
		}

		System.out.println(sum);

	}
}

