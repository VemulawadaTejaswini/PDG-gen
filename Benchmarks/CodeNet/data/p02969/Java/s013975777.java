import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			int r = Integer.valueOf(br.readLine());
			int area = (int)(3 * Math.pow(r, 2));
			System.out.println(area);
		}
	}
}