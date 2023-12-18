import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] strArray = br.readLine().split(" ");
		long[] array = new long[N];
		for (int i = 0; i < N; i++) {
			array[i] = Long.parseLong(strArray[i]);
		}

		int count = 0;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				if (array[i] >= array[j]) {
					count++;
				}
			}
			max = Math.max(max, count);
			count = 0;
		}
	}

}
