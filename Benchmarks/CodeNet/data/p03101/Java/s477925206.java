import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int H = Integer.parseInt(str[0]);
		int W = Integer.parseInt(str[1]);

		str = br.readLine().split(" ");

		int h = Integer.parseInt(str[0]);
		int w = Integer.parseInt(str[1]);

		System.out.println((H - h) * (W - w));
	}
}
