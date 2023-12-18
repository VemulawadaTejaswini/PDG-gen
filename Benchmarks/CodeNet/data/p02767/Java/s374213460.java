import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] livePoint = new int[n];
		for (int i = 0; i < n; i++) {
			livePoint[i] = Integer.parseInt(sc.next());
		}
		Arrays.sort(livePoint);
		int min = -1;
		for (int i = livePoint[0]; i <= livePoint[n - 1]; i++) {
			int total = 0;
			for (int j = 0; j < n; j++) {
				total += (int) Math.pow(i - livePoint[j], 2);
			}
			if (min == -1 || total < min) {
				min = total;
			}
		}
		System.out.println(min);
	}

}
