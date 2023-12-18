import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int Q = Integer.parseInt(in.readLine());
		long[] A = null;
		List<Long> aList = new ArrayList<>();
		long B = 0;
		for (int q = 0; q < Q; ++q) {
			String[] tokens = in.readLine().split(" ");
			int type = Integer.parseInt(tokens[0]);
			if (type == 1) {
				long a = Long.parseLong(tokens[1]);
				// 更新
				A = updateA(A, a);
				aList.add(a);
				B += Long.parseLong(tokens[2]);
			} else {
				// 値を出す
				Long[] values = getValue(A, aList, B);
				System.out.println(values[0] + " " + values[1]);
			}
		}
		in.close();

	}

	static long[] updateA(long[] A, long value) {
		if (A == null) {
			long[] r = new long[2];
			r[0] = value;
			r[1] = value;
			return r;
		} else {
			if (A[0] > value) {
				A[0] = value;
			} else if (A[1] < value) {
				A[1] = value;
			}
			return A;
		}
	}

	static Long[] getValue(long[] A, List<Long> aList, long B) {
		Long[] result = new Long[2];
		result[0] = (A[0] + A[1]) / 2;
		long x = result[0];
		for (int i = 0; i < aList.size(); ++i) {
			B += Math.abs(x - aList.get(i));
		}
		result[1] = B;
		return result;
	}

}
