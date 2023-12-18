
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.next());
		int[] p = new int[N];
		for (int i = 0; i < N; i++) {
			p[i] = Integer.parseInt(scan.next());
		}
		int maxIndex = getMaxIndex(p);
		int sum = 0;
		for (int i = 0; i < N; i++) {
			if (i == maxIndex) {
				sum += p[i] / 2;
			} else {
				sum += p[i];
			}
		}
		System.out.println(sum);

	}

	private static int getMaxIndex(int[] p) {
		int max = p[0];
		int maxIndex = 0;
		for (int i = 1; i < p.length; i++) {
			if (p[i] > max) {
				max = p[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}
}
