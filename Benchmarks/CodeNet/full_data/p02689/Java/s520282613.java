import java.math.BigInteger;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int H[] = new int[N];
		int Way[][] = new int[N][N];
		int p, q;
		int i, j;
		for (i = 0; i < N; i++) {
			H[i] = Integer.parseInt(sc.next());
		}
		for (i = 0; i < M; i++) {
			p = Integer.parseInt(sc.next());
			q = Integer.parseInt(sc.next());
			Way[p - 1][q - 1] = 1;
			Way[q - 1][p - 1] = 1;
		}
		//ここまでinput
		int count = 0;
		boolean flag = true;
		BigInteger high = BigInteger.valueOf(1);
		for (i = 0; i < N; i++) {
			high = BigInteger.valueOf(H[i]);
			flag = true;
			j = 0;
			while (flag && j < N) {
				if (Way[i][j] > 0 && (high.compareTo(BigInteger.valueOf(H[j])) <= 0)) {
					//					System.out.println(
					//							(i + 1) + "展望台は" + high + "で" + (j + 1) + "展望台は" + H[j] + "だから" + (j + 1) + "展望台の方が高い");
					break;
				} else if (j == N - 1) {
					flag = false;
				} else {
					j++;
				}

			}
			if (j == N - 1 && flag == false) {
				count++;
			}
		}
		System.out.println(count);
	}
}
