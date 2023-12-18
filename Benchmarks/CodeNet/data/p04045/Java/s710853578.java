import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	final static PrintStream so = System.out;
	final static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		
		int k = sc.nextInt();
		int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		String[] b = new String[k];
		for (int i = 0; i < k; i++) {
			b[i] = sc.next();
		}
		
		int min = Integer.MAX_VALUE;
		
		for (int i5: a) {
			for (int i4: a) {
				for (int i3: a) {
					for (int i2: a) {
						loop: for (int i1: a) {
							int test = i5*10000 + i4*1000 + i3*100 + i2*10 + i1;
							String ts = String.valueOf(test);
							for (int i = 0; i < k; i++) {
								if (ts.contains(b[i])) {
									continue loop;
								}
							}
							if (test >= n) {
								min = Math.min(min, test);
							}
						}
					}
				}
			}
		}
		so.println(min);
	}
}
