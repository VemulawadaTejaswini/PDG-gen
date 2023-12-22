import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		try {

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String w = reader.readLine();
			
			String text;
			String[] t;
			
			int count = 0;
			while (!(text = reader.readLine()).equals("END_OF_TEXT")) {
				text = text.toLowerCase();
				t = text.split(" ");
				for (int i = 0; i < t.length; i++) {
					if (w.equals(t[i])) {
						count++;
					}
				}
			}
			System.out.println(count);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}