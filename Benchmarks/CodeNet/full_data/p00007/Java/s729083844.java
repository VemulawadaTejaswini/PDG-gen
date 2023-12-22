import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Debt_hell {

	public static void main(String[] args) throws IOException {

		double debt = 100000;
		double interest = 1.05;
		double roundUp = 1000;

		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));

		int inputNo = Integer.parseInt(input.readLine());

		for (int i = 1; i <= inputNo; i++) {
			debt = Math.ceil((debt * interest) / roundUp) * roundUp;
		}

		System.out.println(String.format("%.0f", debt));
	}
}