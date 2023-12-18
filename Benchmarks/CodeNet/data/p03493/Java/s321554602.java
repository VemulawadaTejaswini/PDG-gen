
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		char[] a = line.toCharArray();
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == '1') {
				count++;
			}
		}
		System.out.println(count);
	}
}