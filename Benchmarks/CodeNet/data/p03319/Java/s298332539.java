import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt() - 1;
		int minIdx = 0;
		for (int i = 0; i < n; i++) {
			if (sc.nextInt() == 1) {
				minIdx = i;
			}
		}
		int left = minIdx;
		int right = n - minIdx - 1;
		int total = (left + k - 1) / k;
		right -= left % k;
		total += (right + k - 1) / k;
		System.out.println(total);
	}
}
