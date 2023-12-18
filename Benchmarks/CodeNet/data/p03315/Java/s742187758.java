import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {

			String in = br.readLine();
			String chr[] = in.split("");
			int ans = 0;
			for(String a: chr) {
				ans +=(a.equals("+")?1:-1);

			}
			 System.out.println(ans);
		}
	}
}