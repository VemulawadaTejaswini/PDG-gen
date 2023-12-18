import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		String[] array = s.split(" ");

		for (int i = 0; i < 3; i++) {
			String x = array[i];
			System.out.print(x.charAt(0));
		}
		System.out.println("");

	}
}
