import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] arg) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b;
		String line, str;
		String[] splitedLine;
		try {
			while ((line = br.readLine()) != null) {
				splitedLine = line.split(" ");
				a = Integer.parseInt(splitedLine[0]);
				b = Integer.parseInt(splitedLine[1]);
				str = String.valueOf(a + b);
				System.out.println(str);
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
}