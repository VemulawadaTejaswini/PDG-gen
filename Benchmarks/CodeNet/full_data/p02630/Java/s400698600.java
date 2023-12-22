import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
public class Main {
	public static void main(String[] args)throws IOException {
		FastReader sc = new FastReader();
		PrintWriter pw = new PrintWriter(System.out);
		int n = sc.nextInt();
		long arr[] = new long[n];
		HashMap<Long, Long> map = new HashMap<>();
		long sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLong();
			sum += arr[i];
			if (!map.containsKey(arr[i]))
				map.put(arr[i], (long)1);
			else
				map.put(arr[i], map.get(arr[i]) + 1);
		}
		int q = sc.nextInt();
		while (q-- > 0) {
			long b = sc.nextLong();
			long c = sc.nextLong();
			if (map.containsKey(b)) {
				sum = sum - b * map.get(b) + c * map.get(b);
				long tmp = map.get(b);
				map.put(b, (long)0);
				if (!map.containsKey(c))
					map.put(c, tmp);
				else
					map.put(c, map.get(c) + tmp);
				System.out.println(sum);
			} else
				System.out.println(sum);

		}


	}
}





class FastReader {
	BufferedReader br;
	StringTokenizer st;

	public FastReader() {
		br = new BufferedReader(new
		                        InputStreamReader(System.in));
	}

	String next() {
		while (st == null || !st.hasMoreElements()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException  e) {
				e.printStackTrace();
			}
		}
		return st.nextToken();
	}

	int nextInt() {
		return Integer.parseInt(next());
	}

	long nextLong() {
		return Long.parseLong(next());
	}

	double nextDouble() {
		return Double.parseDouble(next());
	}

	String nextLine() {
		String str = "";
		try {
			str = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}
}