import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String input = "2 2";
		try {
			input = br.readLine();
		} catch (IOException e) {
		}

		int ind = input.indexOf(" ", 0);
		long K = Long.valueOf(input.substring(0, ind));
		long S = Long.valueOf(input.substring(ind + 1, input.length()));
		long N = 0;
		for (int x = 0; x <= K; x++)
			for (int y = 0; y <= K; y++)
				for (int z = 0; z <= K; z++)
					N = N + ((x + y + z) == S ? 1 : 0);
		System.out.print(N);
	}
}
