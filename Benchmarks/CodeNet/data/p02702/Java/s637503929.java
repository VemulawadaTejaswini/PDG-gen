import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		System.out.println(countSubStr(s, s.length(), 2019));
	}

	static int countSubStr(String str, int len, int k) {
		int count = 0;
		for (int i = 0; i < len; i++) {
			int n = 0;
			for (int j = i; j < len; j++) {
				n = n * 10 + (str.charAt(j) - '0');
				if (n % k == 0)
					count++;
			}
		}
		return count;
	}
}
