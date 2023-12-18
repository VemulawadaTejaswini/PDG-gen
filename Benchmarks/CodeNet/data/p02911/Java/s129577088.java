import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();

		int[] p = new int[n]; // players
		for (int i = 0; i < q; i++) {
			int a = sc.nextInt();
			p[a - 1]++;
		}

		StringBuilder sb = new StringBuilder(n * 3);
		for (int num : p) {
			if (num + k - q > 0) {
				sb.append("Yes\n");
			} else {
				sb.append("No\n");
			}
		}

		System.out.println(sb);

		sc.close();
	}
}
