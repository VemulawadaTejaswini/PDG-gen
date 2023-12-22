import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();
		int n  = Integer.parseInt(line);

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		long total = 0L;

		String[] numline  = br.readLine().split(" ");

		for (int i = 0; i < numline.length; i++) {
			int input = Integer.parseInt(numline[i]);

			if (min > input) min = input;
			if (max < input) max = input;
			total += input;
		}

		System.out.println(min + " " + max + " " + total);
	}
}