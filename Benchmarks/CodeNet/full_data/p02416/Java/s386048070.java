import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		short size, sum;
		while (true) {
			sum = 0;
			String input = in.readLine();
			if (input.equals("0")) {
				break;
			}
			size = (short) input.length();
			for (int i = 0; i < size; i += 1) {
				sum += Short.parseShort(Character.toString(input.charAt(i)));
			}
			System.out.println(sum);
		}
	}
}