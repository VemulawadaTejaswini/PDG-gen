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
		List<Long> A = new ArrayList<>();
		long B = 0;
		for (int q = 0; q < Q; ++q) {
			String[] tokens = in.readLine().split(" ");
			int type = Integer.parseInt(tokens[0]);
			if (type == 1) {
				// 更新
				A.add(Long.parseLong(tokens[1]));
				Collections.sort(A);
				B += Long.parseLong(tokens[2]);
			} else {
				// 値を出す
				Long[] values = getValue(A, B);
				System.out.println(values[0] + " " + values[1]);
			}
		}
		in.close();

	}

	static Long[] getValue(List<Long> A, long B) {
		Long[] result = new Long[2];
		if (A.size() % 2 != 0) {
			int index = A.size() / 2;
			result[0] = A.get(index);
		} else {
			int index = A.size() / 2 - 1;
			result[0] = Math.floorDiv(A.get(index) + A.get(index + 1), 2);
		}
		long x = result[0];
		for (int i = 0; i < A.size(); ++i) {
			B += Math.abs(x - A.get(i));
		}
		result[1] = B;
		return result;
	}

}