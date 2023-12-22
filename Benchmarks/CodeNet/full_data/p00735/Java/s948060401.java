import java.util.Scanner;

public class Main {
	static final int N = 300000;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer;
		int[] table = new int[N + 1];
		for (int i = 0; i < N; i++)
			table[i] = 0;
		for (int i = 6; i <= N; i += 7) {
			table[i] = 1;
			table[i + 2] = 1;
		}
		for (int i = 6; i <= N; i++)
			if (table[i] == 1)
				for (int j = i * 2; j <= N; j += i)
					table[j] = 0;
		while (true) {
			int n = sc.nextInt();
			if (n == 1)
				break;
			System.out.print(n + ":");
			for (int i = 6; i < N; i++)
				if (table[i] == 1 && n % i == 0)
					System.out.print(" " + i);
			System.out.println("");
		}
		sc.close();
	}
}