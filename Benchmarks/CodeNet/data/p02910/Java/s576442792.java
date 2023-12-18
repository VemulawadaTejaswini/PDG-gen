import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {

		boolean flag = true;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split("");
		for (int i = 0; i < str.length; i++) {
			if ((i + 1) % 2 == 0) {
				if (str[i].equals("R")) {
					System.out.println("No");
					flag = false;
					break;
				}
			} else {
				if (str[i].equals("L")) {
					System.out.println("No");
					flag = false;
					break;
				}
			}
		}
		if (flag) {
			System.out.println("Yes");
		}
	}
}