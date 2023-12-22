import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] sw = br.readLine().split(" ");
			int s = Integer.parseInt(sw[0]);
			int w = Integer.parseInt(sw[1]);
			System.out.println((w >= s) ? "unsafe" : "safe");
		}
	}
}