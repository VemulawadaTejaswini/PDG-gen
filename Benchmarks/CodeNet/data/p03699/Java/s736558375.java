import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int total = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			int s = sc.nextInt();
			total += s;
			if (s % 10 != 0 && min > s) {
				min = s;
			}
		}
		if (total % 10 == 0) {
			if (min == Integer.MAX_VALUE) {
				System.out.println(0);
			} else {
				System.out.println(total - min);
			}
		} else {
			System.out.println(total);
		}
	}
}
