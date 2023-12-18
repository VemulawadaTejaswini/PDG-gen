import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split("");

		int a[] = new int[str.length + 1];

		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("<")) {
				a[i + 1] = a[i] + 1;
			}
		}
		for (int i = str.length - 1; i >= 0; i--) {
			if (str[i].equals(">")) {
				a[i] = a[i + 1] + 1;
			}
		}

		long sum = 0;
		for (int i : a) {
			sum += i;
		}

		System.out.println(sum);
	}

	static long getSum(int s, int e) {
		long sum = 0;
		for (int i = s; i <= e; i++) {
			sum += i;
		}
		return sum;
	}
}