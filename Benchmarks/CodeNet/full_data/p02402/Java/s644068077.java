import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");

		int max = -1000000;
		int min = 1000000;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			int an = Integer.parseInt(str[i]);
			if (max < an) {
				max = an;
			}
			if (min > an) {
				min = an;
			}
			sum += an;
		}

		System.out.println(min + " " + max + " " + sum);
	}

}