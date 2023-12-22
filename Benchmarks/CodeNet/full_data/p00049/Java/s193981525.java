import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		int[] sum = new int[4];
		String blood;

		while ((line = br.readLine()) != null) {
			blood = line.split(",")[1];

			if (blood.equals("A")) {
				sum[0]++;
			} else if (blood.equals("B")) {
				sum[1]++;
			} else if (blood.equals("AB")) {
				sum[2]++;
			} else if (blood.equals("O")) {
				sum[3]++;
			}
		}
		for (int i : sum) {
			System.out.println(i);
		}
	}
}