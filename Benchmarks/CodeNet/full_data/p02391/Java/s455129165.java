import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputArgs = getInputArgs(br);
		if (Integer.parseInt(inputArgs[0]) > Integer.parseInt(inputArgs[1])) {
			System.out.println("a > b");
			return;
		}
		if (Integer.parseInt(inputArgs[0]) < Integer.parseInt(inputArgs[1])) {
			System.out.println("a < b");
			return;
		}
		System.out.println("a == b");
		return;
	}

	private static String[] getInputArgs(BufferedReader br) throws IOException {
		String line = br.readLine();
		String[] splitLine = line.split("\\s");
		return splitLine;
	}
}