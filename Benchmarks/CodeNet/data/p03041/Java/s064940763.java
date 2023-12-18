import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		String[] str = line.split(" ");
		String [] s = reader.readLine().split("");
		for (int i = 0; i < s.length; i++) {
			if (i == Integer.parseInt(str[1]) - 1) {
				s[i] = s[i].toLowerCase();
			}
			System.out.print(s[i]);
		}
		System.out.println();
//		String[] str = reader.readLine().split(" ");
//		int[] ab = new int[str.length];
//		for (int i = 0; i < str.length; i++) {
//			ab[i] = Integer.parseInt(str[i]);
//		}
	}
}