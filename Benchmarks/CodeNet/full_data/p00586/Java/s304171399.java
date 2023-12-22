import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		String[] lineAry = new String[2];
		int a = 0;
		int b = 0;
		while (true) {
			try {
				line = sc.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (line.length() == 0) {
				break;
			} else {
				lineAry = line.split(" ");
				a = Integer.parseInt(lineAry[0]);
				b = Integer.parseInt(lineAry[1]);
				System.out.println(a + b);
			}
		}
	}
}