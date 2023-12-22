import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	void run() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[] number = new int[N];
		for (int i = 0; i < N; i++) {
			number[i] = Integer.parseInt(br.readLine());
		}

		int maxv = -1000000000;
		int minv = number[0];
		for (int i = 1; i < N; i++) {
			maxv = Math.max(maxv, number[i] - minv); 
			minv = Math.min(number[i], minv);
		}
		System.out.println(maxv);
	}

	public static void main(String[] args) throws IOException {
		new Main().run();
	}
}