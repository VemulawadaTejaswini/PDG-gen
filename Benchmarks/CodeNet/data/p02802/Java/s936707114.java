import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int[] p;
	static int[] q;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		byte[] s = new byte[n];
		Arrays.fill(s, (byte) -1);
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < m; i++) {
			int tmp = sc.nextInt();
			if (sc.next().charAt(0) == 'A') {
				s[tmp] = 1;
			} else {
				if (s[tmp] < 1) {
					++count2;
				}
			}
		}
		for (byte flag : s) {
			if (flag >= 1) {
				++count1;
			}
		}
		System.out.println(count1 + " " + count2);
	}
}
