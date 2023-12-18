import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int[] p;
	static int[] q;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean[] s = new boolean[n];
		int count1 = 0;
		int count2 = 0;
		int[] array = new int[n];
		for (int i = 0; i < m; i++) {
			int tmp = sc.nextInt() - 1;
			if (sc.next().charAt(0) == 'A') {
				if (!s[tmp]) {
					++count1;
					s[tmp] = true;
				}
			} else {
				if (!s[tmp]) {
					++array[tmp];
				}
			}
		}
		for (int i = 0; i < n; i++) {
			if (s[i]) {
				count2 += array[i];
			}
		}
		System.out.println(count1 + " " + count2);
	}
}
