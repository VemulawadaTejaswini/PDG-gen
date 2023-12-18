import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);

		long K = Long.parseLong(in.readLine());
		String[] tokens = in.readLine().split(" ");
		long X = Long.parseLong(tokens[0]);
		long Y = Long.parseLong(tokens[1]);
		if (((K - (Math.abs(X) + Math.abs(Y)) % K)) % 2 != 0) {
			System.out.println("-1");
			return;
		}
		Queue<long[]> queue = new ArrayDeque<>();
		boolean xNegative = X < 0 ? true : false;
		boolean yNegative = Y < 0 ? true : false;
		X = Math.abs(X);
		Y = Math.abs(Y);

		// まずXを合わせる
		long x = 0, y = 0;
		while (x != X) {
			long[] vals = new long[2];
			if (X - x >= K) {
				x += K;
				vals[0] = x;
				vals[1] = y;
			} else {
				y += K - (X - x);
				x = X;
				vals[0] = x;
				vals[1] = y;
			}
			queue.add(vals);
		}
		// 次にYをなるべく近づける
		if ((Y - y) % K == 0) {
			while (Y != y) {
				long[] vals = new long[2];
				y += K;
				vals[0] = x;
				vals[1] = y;
				queue.add(vals);
			}
		} else {
			long mod = 0;
			if (K % 2 == 0 && ((Y - y) > K)) {
				mod = ((Y - y) % K + K) / 2;
			} else {
				mod = ((Y - y) % K) / 2;
			}

			long remain = K - Math.abs(mod);
			long[] vals0 = new long[2];
			x += remain;
			y += mod;
			vals0[0] = x;
			vals0[1] = y;
			queue.add(vals0);
			long[] vals1 = new long[2];
			x -= remain;
			y += mod;
			vals1[0] = x;
			vals1[1] = y;
			queue.add(vals1);

		}

		while (Y > y) {
			long[] vals = new long[2];
			y += K;
			vals[0] = x;
			vals[1] = y;
			queue.add(vals);
		}

		System.out.println(queue.size());
		while (!queue.isEmpty()) {
			long[] vals = queue.poll();
			System.out.println(toLine(vals, xNegative, yNegative));
		}

	}

	static String toLine(long[] vals, boolean xNegative, boolean yNegative) {
		StringBuilder strBuilder = new StringBuilder();
		if (xNegative) {
			strBuilder.append(Long.toString(vals[0] * -1) + " ");
		} else {
			strBuilder.append(Long.toString(vals[0]) + " ");
		}
		if (yNegative) {
			strBuilder.append(Long.toString(vals[1] * -1));
		} else {
			strBuilder.append(Long.toString(vals[1]));
		}
		return strBuilder.toString();
	}
}
