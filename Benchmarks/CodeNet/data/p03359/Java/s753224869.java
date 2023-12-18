import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while ((str = br.readLine()) != null) {
			String inputs[] = str.split(" ");
			int a = Integer.parseInt(inputs[0]);
			int b = Integer.parseInt(inputs[1]);
			int count = 0;
			for (int i = 1; i <= a; i++) {
				if (i == a && a < b) {
					break;
				}
				count++;
			}
			System.out.println(count);
		}
	}
}
