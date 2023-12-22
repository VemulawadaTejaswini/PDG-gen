import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		String[] heightstr = new String[10];
		int[] heightint = new int[10];

		for (int i = 0; i <= 9; i++) {
			str = br.readLine();
			heightstr[i] = str;
			heightint[i] = Integer.parseInt(heightstr[i]);
		}
		for (int j = 0; j <= 8; j++) {
			for (int k = j + 1; k <= 9; k++) {
				Boolean isBig = heightint[j] < heightint[k];
				if (isBig) {
					int temporary = heightint[j];
					heightint[j] = heightint[k];
					heightint[k] = temporary;
				}
			}
		}
		System.out.println(heightint[0]);
		System.out.println(heightint[1]);
		System.out.println(heightint[2]);
	}

}