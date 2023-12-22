import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] tmp = br.readLine().split(" ");
		long[] input = new long[n];
		for (int i = 0; i < n; i++) {
			input[i] = Long.parseLong(tmp[i]);
		}
		long max = input[0];
		long min = input[0];
		long sum = 0;
		for(long x : input){
			max = Math.max(max, x);
			min = Math.min(min, x);
			sum += x;
		}
		System.out.printf("%d %d %d%n", min, max, sum);
	}

}