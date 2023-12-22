import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		long[] arr = new long[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Long.parseLong(br.readLine());
		}

		long result = Long.MIN_VALUE;
		long min = Long.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			if (arr[i] > min)
				continue;
			
			min = arr[i];
	
			for (int j = i + 1; j < N; j++) {
				if (arr[j] - arr[i] > result)
					result = arr[j] - arr[i];
			}
		}

		System.out.println(result);

		if (br != null) {
			br.close();
			br = null;
		}
	}
}