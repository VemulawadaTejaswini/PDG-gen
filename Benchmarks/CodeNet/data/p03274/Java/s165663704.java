import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		String[] str1 = str.split(" ");
		int N = Integer.parseInt(str1[0]);
		int K = Integer.parseInt(str1[1]);
		str = bf.readLine();
		str1 = str.split(" ");
		long[] data = new long[N];

		long res = 0;
		long start = Long.parseLong(str1[0]);
		long end = Long.parseLong(str1[N - 1]);
		if (start >= 0) {
			res = Long.parseLong(str1[K - 1]);
			System.out.println(res);
			return;
		}
		if (end <= 0) {
			res = Long.parseLong(str1[N - K]);
			System.out.println(Math.abs(res));
			return;
		}

		if (K == N) {
			res = Math.abs(end - start) + Math.abs(start);
			System.out.println(res);
			return;
		}

		end = Long.parseLong(str1[K - 1]);
		long sum = Math.abs(end - start) + Math.abs(start);
		long tmpSum = 0;
		for (int i = 0; i < N; i++) {
			end = Long.parseLong(str1[i]);
			data[i] = end;
			if (i >= K) {
				start = data[i - K + 1];
				tmpSum = Math.abs(end - start) + Math.abs(start);
				if (tmpSum < sum) {
					sum = tmpSum;
				}
			}
		}

		System.out.println(sum);
		return;
	}
}