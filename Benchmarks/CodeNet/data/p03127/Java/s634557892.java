import java.util.*;

public class Main {
	int N;
	long[] A;
	long result;

	Main() {
		Scanner in = new Scanner(System.in);
		N = Integer.parseInt(in.nextLine());
		A = new long[N];
		String[] tokens = in.nextLine().split(" ");
		for (int i = 0; i < N; ++i) {
			A[i] = Long.parseLong(tokens[i]);
		}
		in.close();
	}

	void calc() {
		result = gcd(A[0], A[1]);
		for (int i = 2; i < N; ++i) {
			result = gcd(A[i], result);
		}
	}

	long gcd(long large, long small) {
		if (small > large) {
			return gcd(small, large);
		}
		long mod = large % small;
		if (mod == 0) {
			return small;
		}
		return gcd(small, mod);
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calc();
		System.out.println(ins.result);
	}

}