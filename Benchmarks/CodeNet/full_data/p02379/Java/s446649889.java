import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");

		int x1 = Integer.parseInt(str[0]);
		int y1 = Integer.parseInt(str[1]);
		int x2 = Integer.parseInt(str[2]);
		int y2 = Integer.parseInt(str[3]);

		double d = Math.sqrt((x1 - x2) *2 + (y1-y2)*2);
		System.out.println(d);

	}
}