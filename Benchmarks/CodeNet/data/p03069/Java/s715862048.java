import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		int N = Integer.parseInt(line);
		String[] str = reader.readLine().split("");
		int ans = N;
		int white = 0;
		int black = 0;
		int[] ans_j = new int[N];
		for (int j = 0; j < N; j++) {
		    for (int i = 0; i < N; i++) {
				if (i <= j && str[i].equals("#")) {
					black++;
				}
				else if (i > j && str[i].equals(".")) {
					white++;
				}
			}
			ans_j[j] = black + white;
			white = 0;
		    black = 0;
		}
		for (int i = 0; i < N; i++) {
			if (ans_j[i] < ans) {
				ans = ans_j[i];
			}
		}
		System.out.println(ans);
	}
}