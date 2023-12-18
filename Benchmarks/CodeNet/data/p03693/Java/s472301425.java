

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// Here your code !
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().replace(" ", "");

		System.out.println(Integer.parseInt(str)%4 == 0 ? "YES" : "NO");
	}
}