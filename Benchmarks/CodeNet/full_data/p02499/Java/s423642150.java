import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] arg) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			int count;
			String line = reader.readLine();
			line=line.toLowerCase();
			for (char c = 'a'; c <= 'z'; c++) {
				count = 0;
				for (int i = 0; i < line.length(); i++) {
					if (line.charAt(i) == c) {
						count++;
					}
				}
				System.out.println(c + " : " + count);
			}
		}Finally
	}
}