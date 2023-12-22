import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");

		double x1 = Double.parseDouble(str[0]);
		double y1 = Double.parseDouble(str[1]);
		double x2 = Double.parseDouble(str[2]);
		double y2 = Double.parseDouble(str[3]);

		double d = Math.sqrt((x1 - x2) *2 + (y1-y2)*2);
		System.out.println(d);

	}
}