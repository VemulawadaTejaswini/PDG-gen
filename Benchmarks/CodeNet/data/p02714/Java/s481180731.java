import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		long sum[] = new long[n];
		for (int i = 3; i < n; i++) {
			char x = s.charAt(i);
			sum[i] += sum[i-1] + he(i, s, x);
		}
		System.out.println(sum[n-1]);
	}

	private static int he(int n, String s, char x) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == x) {
				continue;
			}
			for (int j = i+1; j < n; j++) {
				if (s.charAt(j) == s.charAt(i) || s.charAt(j) == x) {
					continue;
				}
				if (n-j == j-i) {
					continue;
				}
				sum++;
			}
		}
		return sum;
	}

}
