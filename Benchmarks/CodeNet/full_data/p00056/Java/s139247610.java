import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer;
		while (true) {
			int n = sc.nextInt();
			answer = 0;
			if (n == 0)
				break;
			if (n % 2 == 0 && n >= 4) {
				int[] table = new int[n + 1];
				table[0] = 0;
				table[1] = 0;
				for (int i = 2; i <= n; i++) {
					table[i] = 1;
				}
				for (int i = 2; i <= Math.sqrt(n) + 1; i++)
					if (table[i] == 1)
						for (int j = i * 2; j <= n; j += i)
							table[j] = 0;
				for (int i = 2; i <= n / 2; i++)
					if (table[i] == 1 && table[n - i] == 1)
						answer++;
			}
			System.out.println(answer);
		}
		sc.close();
	}
}