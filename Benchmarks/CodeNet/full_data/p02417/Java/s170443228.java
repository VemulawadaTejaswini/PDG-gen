import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(
				System.in));
		String str = br.readLine();
		str = str.toLowerCase();
		int a[] = new int[26];
	
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (ch <= 'z' && ch >= 'a') {
					a[ch - 97]++;
				}

			}
	

		for (int i = 0; i < 26; i++) {
			System.out.println((char) ('a' + i) + " : " + a[i]);
		}


	}

}