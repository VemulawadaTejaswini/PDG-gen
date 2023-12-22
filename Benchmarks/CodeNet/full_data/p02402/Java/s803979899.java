import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        String[] lines ={"a","b"};
        while ((line = br.readLine()) != null) {
        	int j = 0;
        	lines[j] = line;
        	j++;
        }

		int n = Integer.parseInt(lines[0]);
		String str2 = lines[1];

		String[] ai = str2.split(" ", 0);

		int sVal = 0;
		int min = Integer.parseInt(ai[0]);
		for (int i = 0; i < n; i++) {
			int num1 = Integer.parseInt(ai[i]);
			int num2 = Integer.parseInt(ai[i + 1]);
			if (num1 <= num2) {
				sVal = num1;
			} else {
				sVal = num2;
			}
			if (sVal <= min) {
				min = sVal;
			}
		}

		int bVal = 0;
		int max = Integer.parseInt(ai[0]);
		for (int i = 0; i < n; i++) {
			int num1 = Integer.parseInt(ai[i]);
			int num2 = Integer.parseInt(ai[i + 1]);
			if (num1 <= num2) {
				bVal = num2;
			} else {
				bVal = num1;
			}
			if (max <= bVal) {
				max = bVal;
			}
		}

		int sum = Integer.parseInt(ai[0]);
		for (int i = 1; i < n; i++) {
			int num = Integer.parseInt(ai[i]);
			sum = +num;
		}

		System.out.println(min + " " + max + " " + sum);

	}
}