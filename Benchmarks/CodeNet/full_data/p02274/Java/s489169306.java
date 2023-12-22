import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// ALDS1_5_D
public class Main {
	void run() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		int[] A = new int[n];
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			A[i] = Integer.parseInt(str[i]);
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (A[i] > A[j]) cnt++;
			}
		}
		System.out.println(cnt);
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
}

