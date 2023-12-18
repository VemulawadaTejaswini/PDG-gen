import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int p = sc.nextInt();
		int q = sc.nextInt();
		int r = sc.nextInt();

		int[] ft = {p + q, q + r, r + p};
		Arrays.sort(ft);

		System.out.println(ft[0]);

		sc.close();
	}

}
