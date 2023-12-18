import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//		String line = reader.readLine();
		String[] str = reader.readLine().split(" ");
		int[] ab = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			ab[i] = Integer.parseInt(str[i]);
		}
		int ans = ab[0] - ab[1] + 1;
		System.out.println(ans);
	}
}
