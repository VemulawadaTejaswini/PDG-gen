import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int[] value = new int[n+1];
			value[0] = 0;
			for (int i = 1; i < n+1; i++) {
				value[i] = sc.nextInt() + value[i-1];
			}
			int max = -Integer.MAX_VALUE;
			for (int i = 0; i < n+1; i++) {
				for (int j = i+1; j < n+1; j++) {
					max = Math.max(value[j] - value[i], max);
				}
			}
			System.out.println(max);
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}