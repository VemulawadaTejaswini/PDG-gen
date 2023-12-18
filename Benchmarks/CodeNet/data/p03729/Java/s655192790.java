import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		String[] array = s.split(" ");
		char a = (array[0]).charAt(array[0].length() - 1);
		char b = (array[1]).charAt(0);
		char c = (array[1]).charAt(array[1].length() - 1);
		char d = (array[2]).charAt(0);

		if (a == b && c == d) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}