import java.util.*;
import static java.lang.System.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] point = new int[n];
		int sum = 0;
		int sa = 0;
		int num = 0;
		for (int i = 0; i < n; i++) {
			point[i] = m + i;
			sum += point[i];
		}
		int min = Integer.MAX_VALUE / 10;
		for (int i = 0; i < n; i++) {
			int eated = sum - point[i];
			sa = Math.abs(sum - eated);
			if (min > sa) {
				num = i;
				min = sa;
			}
			}
		out.println(sum - point[num]);

	}
}