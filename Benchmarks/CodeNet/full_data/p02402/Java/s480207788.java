import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int sum = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String[] inputArray = br.readLine().split(" ");

		int input = 0;
		for (int i=0; i<N; i++) {
			input = Integer.parseInt(inputArray[i]);
			if (max < input) {
				max = input;
			}

			if (min > input) {
				min = input;
			}

			sum += input;
		}

		System.out.println(min +" "+ max +" "+ sum);
	}
}