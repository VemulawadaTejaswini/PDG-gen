import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int max = 0;
		int maxnum = 0;
		int submax = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if (max <= a[i]) {
				submax = max;
				max = a[i];
				maxnum = i;
			} else if (submax <= a[i]) {
				submax = a[i];
			}
		}
		for (int i = 0; i < n; i++) {
			if (i == maxnum) {
				System.out.println(submax);
			} else {
				System.out.println(max);
			}
		}
	}
}