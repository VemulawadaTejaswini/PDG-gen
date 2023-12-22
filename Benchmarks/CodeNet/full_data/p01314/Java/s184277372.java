
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
		int[] ans = new int[1001];
		for (int i=1;i<=1000;i++) for (int j=i+1;j<1000;j++){
			int sum = calc(j) - calc(i-1);
			if (sum <= 1000) ans[sum]++;
		}
		
		for (;;) {
			int n = sc.nextInt();
			if (n == 0) break;
			System.out.println(ans[n]);
		}
	}
	
	int calc(int x) {
		return x * (x+1) / 2;
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}