import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	static BufferedReader br;

	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println((Integer.parseInt(br.readLine())
				+ Integer.parseInt(br.readLine()))
				* Integer.parseInt(br.readLine()) / 2);
	}
}