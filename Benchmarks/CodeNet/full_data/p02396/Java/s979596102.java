import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		int i = 1;
		while (true) {
			br = new BufferedReader(new InputStreamReader(System.in));
			num = Integer.parseInt(br.readLine());

			if (num == 0) {
				break;
			} else {
				System.out.println("Case " + i + ": " + num);
			}
			i++;
		}
	}

}