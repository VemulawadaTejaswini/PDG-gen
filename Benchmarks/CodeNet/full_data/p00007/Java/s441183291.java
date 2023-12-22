import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int weeks = Integer.parseInt(str);
		long debtRound = 100000;
		for (int i = 1; i <= weeks; i++) {
			long debt = (long) (debtRound * 1.05);
			debtRound = (long) Math.ceil((double) debt / 1000) * 1000;
		}
		System.out.println(debtRound);
	}
}