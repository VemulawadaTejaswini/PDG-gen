import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		String s;
		while (!(line = br.readLine()).equals("0")) {
			s = Integer.toOctalString(Integer.parseInt(line));
			s = s.replace('7', '9');
			s = s.replace('6', '8');
			s = s.replace('5', '7');
			s = s.replace('4', '5');
			System.out.println(s);
		}
	}
}