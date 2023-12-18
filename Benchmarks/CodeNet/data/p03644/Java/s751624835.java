import java.util.*;

public class Main {
	static final int[] EVEN = new int[]{1, 2, 4, 8, 16, 32, 64};
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		for (int i = 0; i < EVEN.length; i++) {
			if (EVEN[i] <= n) {
				max = EVEN[i];
			}
		}
		System.out.println(max);
	}
}
