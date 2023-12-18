import java.util.*;

public class Main {
	long N, M;
	long result = 0;

	Main() {
		Scanner in = new Scanner(System.in);
		N = in.nextLong();
		M = in.nextLong();
		in.close();
	}

	void calc() {
		if (N >= 2 && M >= 2) {
			result = (N - 2) * (M - 2);
		} else if (N == 1 && M == 1) {
			result = 1;
		} else {
			result = Math.max(N, M) - 2;
		}
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calc();
		System.out.println(ins.result);
	}

}