import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int M = Integer.parseInt(tokens[1]);
		int Q = Integer.parseInt(tokens[2]);
		int[] l = new int[M];
		int[] r = new int[M];
		int[] p = new int[Q];
		int[] q = new int[Q];
		for (int i = 0; i < M; ++i) {
			tokens = in.nextLine().split(" ");
			l[i] = Integer.parseInt(tokens[0]);
			r[i] = Integer.parseInt(tokens[1]);
		}
		for (int i = 0; i < Q; ++i) {
			tokens = in.nextLine().split(" ");
			p[i] = Integer.parseInt(tokens[0]);
			q[i] = Integer.parseInt(tokens[1]);
		}

		for (int i = 0; i < Q; ++i) {
			System.out.println(calcSimple(p[i], q[i], l, r));
		}
		in.close();
	}

	private static int calcSimple(int p, int q, int[] l, int[] r) {
		int result = 0;
		for (int i = 0; i < l.length; ++i) {
			if (p <= l[i] && r[i] <= q) {
				++result;
			}
		}
		return result;
	}
}