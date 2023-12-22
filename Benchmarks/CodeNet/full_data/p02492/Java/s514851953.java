import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String line = br.readLine();
			if (line.equals("0 ? 0")) {
				break;
			}
			String[] buf = line.split(" ");
			int result = 0;
			switch (buf[1]) {
			case "+":
				result = Integer.parseInt(buf[0]) + Integer.parseInt(buf[2]);
				break;
			case "-":
				result = Integer.parseInt(buf[0]) - Integer.parseInt(buf[2]);
				break;
			case "*":
				result = Integer.parseInt(buf[0]) * Integer.parseInt(buf[2]);
				break;
			case "/":
				result = Integer.parseInt(buf[0]) / Integer.parseInt(buf[2]);
				break;
			}
			System.out.println(result);
		}
	}
}