import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		int[] a = new int[100001];
		while (true) {
			int n = sc.nextInt(), k = sc.nextInt();
			if (n == 0 && k == 0) break;
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int max = 0;
			for (int i = 0; i < k; i++)
				max += a[i];
			int sum = max;
			for (int i = 0; i < n-k; i++) {
				sum = sum - a[i] + a[i+k];
				max = Math.max(max, sum);
			}
			out.println(max);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}