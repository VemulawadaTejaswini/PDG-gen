
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			if(n == 0) break;
			int min = 500, max = 0;
			for(int i=0;i<n;i++) {
				int sum = 0;
				for(int j=0;j<5;j++) sum += sc.nextInt();
				min = min(sum, min); max = max(sum, max);
			}
			System.out.println(max + " " + min);
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}