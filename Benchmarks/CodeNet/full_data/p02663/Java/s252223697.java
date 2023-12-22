import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int H1 = sc.nextInt();
		int M1 = sc.nextInt();
		int H2 = sc.nextInt();
		int M2 = sc.nextInt();
		int K = sc.nextInt();

		int subH = H2 - H1;
		int subM = M2 - M1;
		if (subM < K) {
			System.out.println(60 * (subH - 1) + subM + 60 - K);
		} else {
			System.out.println(60 * subH + K - subM);
		}

	}

}
