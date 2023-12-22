import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		try {

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String s, p;
			s = reader.readLine();
			p = reader.readLine();
			
			s = s.concat(s);
			
			if (s.contains(p)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}