import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			String[] in = br.readLine().split(" ");
			int n = Integer.valueOf(in[0]);
			int d = Integer.valueOf(in[1]);
			System.out.println(Math.round((double)n/(d*2)));
		}
	}
}