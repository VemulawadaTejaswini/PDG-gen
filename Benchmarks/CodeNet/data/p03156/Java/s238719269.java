import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max = n / 3;
		int p1 = 0;
		int p2 = 0;
		int p3 = 0;
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (x <= a) {
				p1++;
			} else if (x <= b) {
				p2++;
			} else {
				p3++;
			}
		}
		max = Math.min(p1, max);
		max = Math.min(p1 - max + p2, max);
		max = Math.min(p3, max);
		System.out.println(max);
	}
}
