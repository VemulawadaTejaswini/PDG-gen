import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int L = sc.nextInt();
			int[] street = new int[N];
			int[] result = new int[N];

			// 道路
			for (int i = 0; i < K; i++) {
				int p = sc.nextInt();
				int q = sc.nextInt();
				street[p - 1] = 1;
				street[q - 1] = 1;
			}
			// 鉄道
			for (int i = 0; i < L; i++) {
				int r = sc.nextInt();
				int s = sc.nextInt();
				if (street[r - 1] != 0 && street[s - 1] != 0) {
					result[r - 1] = 2;
					result[s - 1] = 2;
				} else {
					if (result[r - 1] < 1) {
						result[r - 1] = 1;
					}
					if (result[s - 1] < 1) {
						result[s - 1] = 1;
					}
				}
			}
			String[] citiesStr = new String[N];
			for (int i = 0; i < result.length; i++) {
				if (result[i] == 0) {
					result[i] = street[i];
				}
				citiesStr[i] = Integer.toString(result[i]);
			}
			System.out.println(String.join(" ", citiesStr));
		}
	}
}
