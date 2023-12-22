
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = bf.readLine()) != null) {
			System.out.println(line.replaceAll("peach", "~-~").replaceAll("apple", "_-_").replaceAll("~-~", "apple").replaceAll("_-_", "peach"));
		}
	}
}