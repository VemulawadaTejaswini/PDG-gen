import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("src/aoj2100/input.txt"));
			// System.setOut(new PrintStream(new FileOutputStream("src/aoj1172/result.txt")));
		} catch (FileNotFoundException e) {
		}
		new Main().run();
	}

	Scanner sc;
	void run() {
		sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0) {
			solve();
		}
	}
	void solve(){
		int N = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < N; i++)
			a[i] = sc.nextInt();

		int A = 0, B = 0;
		for (int i = 1; i < N; i++) A = max(A, a[i] - a[i-1]);
		for (int i = 1; i < N; i++) B = max(B, a[i-1] - a[i]);
		System.out.println(A + " " + B);
	}

	void tr(Object... os) {
		System.err.println(deepToString(os));
	}
}