import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class example{
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line = reader.readLine();
			int day = Integer.parseInt(line);
			String strs = "Christmas";
			String eves = " Eve";
			
			for (int i = 0; i < 25 - day; i++) {
				strs = strs + eves;
			}
			
			System.out.println(strs);
			
		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("wrong");
		}
	}
}

        