import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str;
			while ((str = br.readLine()) != null) {
				String capital = str.toUpperCase();
				System.out.println(capital);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}