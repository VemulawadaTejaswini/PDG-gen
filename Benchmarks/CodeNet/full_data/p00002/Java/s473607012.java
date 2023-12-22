import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while ((line = br.readLine()) != null) {
			String[] splited = line.split(" ");
			int value = Integer.parseInt(splited[0]) + Integer.parseInt(splited[1]);
			System.out.println(Integer.toString(value).length());
		}
		br.close();
	}
}