import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt(), N = sc.nextInt(), K = sc.nextInt();
		char[][] field = new char[M][N];
		for (int i = 0; i < M; i++)
			field[i] = sc.next().toCharArray();
		for (int i = 0; i < K; i++) {
			int[] result = new int[3];
			int a = sc.nextInt() - 1, b = sc.nextInt() - 1, c = sc.nextInt() - 1, d = sc
					.nextInt() - 1;
			for (int j = a; j <= c; j++)
				for (int k = b; k <= d; k++)
					switch (field[j][k]) {
					case 'J':
						result[0]++;
						break;
					case 'O':
						result[1]++;
						break;
					case 'I':
						result[2]++;
						break;
					}
			System.out.println(result[0] + " " + result[1] + " " + result[2]);
		}
		sc.close();
	}
}