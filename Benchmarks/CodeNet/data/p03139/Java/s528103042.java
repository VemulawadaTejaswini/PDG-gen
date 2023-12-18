package test;

public class Main {

	public static void main(String[] args) {

		long N = Long.valueOf(args[0]);
		long A = Long.valueOf(args[1]);
		long B = Long.valueOf(args[2]);

		exec(N, A, B);

	}

	private static void exec(long _N, long _A, long _B) {

		long max = 0;
		if (_A > _B) {
			max = _B;
		} else {
			max = _A;
		}

		long min = 0;
		min = _A + _B;
		if (min > _N) {
			min -= _N;
		} else {
			min = 0;
		}

		System.out.println(Long.toString(max) + " " + Long.toString(min));
	}

}
