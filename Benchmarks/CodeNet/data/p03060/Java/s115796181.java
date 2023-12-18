import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] v = new int[n];
		int[] c = new int[n];
		for (int i = 0; i < n; i++)
			v[i] = scan.nextInt();
		for (int i = 0; i < n; i++)
			c[i] = scan.nextInt();

		int ans = 0;
		for (int i = 0; i < n; i++)
			if (v[i] - c[i] > 0)
				ans += v[i] - c[i];
		System.out.println(ans);
	}
    public static void main(String[] args) {
    	new Main().run();
    }
}
