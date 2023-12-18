import java.util.*;

public class Main {
	public static void main(String[] args) {
		int N = 3;
		Scanner sc = new Scanner(System.in);
		int[] As = new int[N];
		As[0] = sc.nextInt();
		As[1] = sc.nextInt();
		As[2] = sc.nextInt();

		int minCost = Integer.MAX_VALUE;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					if ( i != j && j != k && k != i ) {
						int cost = 0;
						cost += 0;
						cost += Math.abs(As[i] - As[j]);
						cost += Math.abs(As[j] - As[k]);

//					System.out.println(i +","+ j + "," + k + "," + cost);
//
						if (cost < minCost) {
							minCost = cost;
						}
//
					}
				}
			}
		}

		System.out.println(minCost);
	}
}