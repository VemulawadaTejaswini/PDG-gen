import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int[] map = new int[10010];
		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= 100; j++) {
				for (int k = 1; k <= 100; k++) {
					int n = calc(i,j,k);
					if (n < 10010) {
						map[n]+=1;
					}
				}
			}
		}
		for (int i = 1; i <= m; i++) {
			System.out.println(map[i]);
		}

	}

	private static int calc(int i, int j, int k) {
		return i*i + j*j + k*k + i*j + i*k + j*k;
	}

}
