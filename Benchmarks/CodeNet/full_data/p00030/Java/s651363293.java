
import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("src/aoj0030/input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("src/xxxyyyy/result.txt")));
		} catch (FileNotFoundException e) {
		}
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int s = sc.nextInt();
			if (n == 0 && s == 0)
				break;
			System.out.println(solve(n, s));
		}
	}

	int solve(int N, int sum) {
		int res = 0;
		for (int set = 0; set < 1 << 10; set++) {
			int temp = 0;
			int bit = 0;
			for (int k = 0; k < 10; k++)
				if ((set >> k & 1) == 1) {
					temp += k;
					bit++;
				}
			if( bit == N && temp == sum )
				res++;
		}
		return res;
	}

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}
}