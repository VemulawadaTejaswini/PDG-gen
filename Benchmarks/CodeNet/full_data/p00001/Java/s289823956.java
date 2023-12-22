import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] a) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] Hills = new int[10];
		for (int i = 0; i < Hills.length; i++) {
			Hills[i] = Integer.parseInt(br.readLine());
		}

		int len = Hills.length - 1;
		for (int i = 0; i <= len - 3; i++) {
			if (Hills[len] < Hills[i]) {
				int temp = Hills[i];
				Hills[i] = Hills[len];
				Hills[len] = temp;
			} else if (Hills[len - 1] < Hills[i]) {
				int temp = Hills[i];
				Hills[i] = Hills[len - 1];
				Hills[len - 1] = temp;
			} else if (Hills[len - 2] < Hills[i]) {
				int temp = Hills[i];
				Hills[i] = Hills[len - 2];
				Hills[len - 2] = temp;
			}
		}

		if (Hills[len] < Hills[len - 1]) {
			int temp = Hills[len];
			Hills[len] = Hills[len - 1];
			Hills[len - 1] = temp;
		}
		if (Hills[len - 1] < Hills[len - 2]) {
			int temp = Hills[len - 1];
			Hills[len - 1] = Hills[len - 2];
			Hills[len - 2] = temp;
		}

		for (int i = 9; i >= 7; i--) {
			System.out.println(Hills[i]);
		}

	}
}