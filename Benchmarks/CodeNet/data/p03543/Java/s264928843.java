

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();
		char a = line.charAt(0);
		char b = line.charAt(1);
		char c = line.charAt(2);
		char d = line.charAt(3);
		String t = "No";

		if ((a==b&&b==c)|(b==c&&c==d)) {
		t="Yes";
		}
		System.out.println(t);
	}
}