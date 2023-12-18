import java.util.Arrays;
import java.util.Scanner;

public class D_Triangles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//標準入力取得
		int num = sc.nextInt();
		int edge[] = new int[num];
		for (int i = 0; i < num; i++) {
			edge[i] = sc.nextInt();
		}

		Arrays.sort(edge);

		int triangle = 0;
		for (int i = 0; i < num - 2; i++) {
			for (int j = i + 1; j < num - 1; j++) {
				for (int k = j + 1; k < num; k++) {
					if (condition(edge[i], edge[j], edge[k])) {
						triangle++;
					} else {
						break;
					}
				}
			}
		}
		System.out.println(triangle);

		sc.close();

	}

	private static boolean condition(int i, int j, int k) {
		boolean result = false;

		if (i < j + k && j < k + i && k < i + j) {
			result = true;
		}
		return result;
	}

}
