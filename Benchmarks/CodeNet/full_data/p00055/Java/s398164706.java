import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null) {

			double a = Double.parseDouble(line);
			double[] prog = new double[10];
			double sum = 0;

			prog[0] = a;
			for (int i = 1; i < 10; i++) {
				if ((i % 2) == 1) {
					prog[i] = prog[i - 1] * 2;
				} else {
					prog[i] = prog[i - 1] / 3;
				}
			}
			for (int i = 0; i < 10; i++) {
				sum += prog[i];
			}
			System.out.println(sum);
		}
	}
}