
//Computation - Min, Max and Sum
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		 int n =Integer.parseInt(in.readLine());
		 String[] a = in.readLine().split(" ");

//		String n = "5";
//		String[] a = "10 1 5 4 17".split(" ");

		int min = 1000000;
		int max = -1000000;
		int sum = 0;

		int ai;

		for (int i = 0; i < n; i++) {

			ai = Integer.parseInt(a[i]);

			if (ai < min) {
				min = ai;
			}

			if (ai > max) {
				max = ai;
			}

			sum += ai;

		}

		System.out.println(min + " " + max + " " + sum);

	}
}