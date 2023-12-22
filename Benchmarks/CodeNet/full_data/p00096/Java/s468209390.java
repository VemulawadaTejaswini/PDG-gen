import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	static void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	void run() {
		for (;sc.hasNext(); ){
		int n = sc.nextInt();

		int[] count = new int[2001];
		for (int i = 0; i <= 1000; i++) {
			for (int j = 0; j <= 1000; j++) {
				count[i + j]++;
			}
		}

		int ans = 0;
		for (int i = 0; i <= 1000; i++) {
			for (int j = 0; j <= 1000; j++) {
				if (n - i - j >= 0 && n - i - j <= 2000) {
					ans += count[n - i - j];
				}
			}
		}
		System.out.println(ans);


	}
	}

}