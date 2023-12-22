
import java.io.*;
import java.util.Arrays;

public class Main {

	//ツ　2260 (iwi)
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String s = reader.readLine();
		
		int cnt = 0;
		for(int i = 0; i < (s.length()+1) / 2; i++) {
			int c1 = s.charAt(i);
			int c2 = s.charAt(s.length() - 1 - i);
			boolean eq = false;
			if ((c1 == 'i' || c1 == 'w') && c1 == c2) {
				eq = true;
			}
			if (c1 == '(' && c2 == ')') {
				eq = true;
			}
			if (c2 == '(' && c1 == ')') {
				eq = true;
			}
			if (!eq) {
				//System.out.printf("%c %c\n", s.charAt(i), s.charAt(s.length() - 1 - i));
				cnt++;
			}
		}		
		System.out.printf("%d\n", cnt);
		reader.close();
	}
}