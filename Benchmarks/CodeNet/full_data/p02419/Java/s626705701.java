import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		String w = input.readLine();
		String t;
		int num = 0;

		while (!(t = input.readLine()).equals("END_OF_TEXT")) {
			t = t.toLowerCase();
			Scanner scan = new Scanner(t);
			while (scan.hasNext()) {
				String str = scan.next();
				if (str.equals(w))
					num++;
			}

		}

		System.out.println(num);
	}
}