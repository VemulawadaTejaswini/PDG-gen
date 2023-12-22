import java.util.Scanner;

public class Main {

	public static int get_max_profit(int[] a) {
		if (a.length == 0)
			return 0;
		int max = Integer.MIN_VALUE;
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			max = Math.max(a[i] - min, max);
			min = Math.min(a[i], min);
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		System.out.println(get_max_profit(a));
	}

}

