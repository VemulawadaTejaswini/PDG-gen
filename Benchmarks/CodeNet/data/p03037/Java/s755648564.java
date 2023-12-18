import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] l = new int[m];
		int[] r = new int[m];
		for (int i = 0; i < m; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}
		int left = 1;
		int right = n;
		for (int i = 0; i < m; i++) {
			left = Math.max(left, l[i]);
			right = Math.min(right, r[i]);
		}
		System.out.println(Math.max(0, right - left + 1));
	}
}