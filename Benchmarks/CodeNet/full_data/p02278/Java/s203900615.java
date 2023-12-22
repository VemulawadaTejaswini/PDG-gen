
import java.util.*;

public class Main {
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] W = new int[n]; 
		for (int i = 0; i < n; i++) {
			W[i] = scanner.nextInt();
		}
		System.out.println(minCostSort(W, n));
	}
	public static int minCostSort(int[] W, int n) {
		int cost = 0, min, k, t;
		for (int i = 0; i < n - 1; i++) {
			min = W[i + 1];
			k = i + 1;
			for (int j = i + 2; j < n; j++) {
				if (min > W[j]) {
					min = W[j];
					k = j;
				}
			}
			if (W[i] > min) {
				cost += W[i] + W[k];
				t = W[i];
				W[i] = W[k];
				W[k] = t;
			}
		}
		return cost;
	}
}