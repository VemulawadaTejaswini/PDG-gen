import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//BufferedReader in = new BufferedReader(new FileReader(new File("input.txt")));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] line = in.readLine().split(" ");
		int r = conv(line[0]);
		int D = conv(line[1]);
		int x2000 = conv(line[2]);
		for(byte i = 0; i < 10; i++) {
			x2000 = r * x2000 - D;
			System.out.println(x2000);
		}
	}
	public static int conv(String s) {
		return Integer.valueOf(s);
	}
}
