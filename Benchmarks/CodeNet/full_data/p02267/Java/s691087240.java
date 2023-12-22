import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	void run() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] S = br.readLine().split(" ");
		int q = Integer.parseInt(br.readLine());
		String[] T = br.readLine().split(" ");
		
		int count = 0;
		for (int i = 0; i < q; i++) {
			String searchWord = T[i];
			for (int j = 0; j < n; j++) {
				if (searchWord.equals(S[j])) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) throws IOException {
		new Main().run();
	}
}