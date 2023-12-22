import java.util.*;
import java.io.*;

class Main {
	static PrintStream out = System.out;
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int n = in.nextInt();
		int a = in.nextInt();
		long min = a,max = a,sum = a;
		for (int i = 1; i < n; i++) {
			a = in.nextInt();
			min = Math.min(a, min);
			max = Math.max(a, max);
			sum += a;
		}
		out.println(String.format("%d %d %d", min, max, sum));
	}
}