import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int Ri = sc.nextInt();
		int Rj = 1;
		int minv = Ri; 					// Rjより前の最小値
		int maxv = Integer.MIN_VALUE;	// 差の最大値

		for (int i = 1; i < n; i++) {
			Rj = sc.nextInt();
			maxv = Math.max(Rj - minv, maxv);
			minv = Math.min(minv, Rj);
		}

		System.out.println(maxv);

	}

}

