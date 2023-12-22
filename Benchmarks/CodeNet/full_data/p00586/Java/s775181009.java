import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] split = line.split(" ");
				int sum = Integer.parseInt(split[0]) + Integer.parseInt(split[1]);
				System.out.println(sum);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}