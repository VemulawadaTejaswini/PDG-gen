import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String sentence;
		int[] abc = new int[26];

		while ((sentence=br.readLine())!=null) {

			for (int i = 0; i < sentence.length(); i++) {
				char c = sentence.charAt(i);
				c = Character.toLowerCase(c);
				char cc = 'a';
				for (int j = 0; j < abc.length; j++) {
					if (cc == c) {
						abc[j]++;
						cc++;
					} else {
						cc++;
					}
				}

			}
			char cc = 'a';
			for (int i = 0; i < abc.length; i++) {
				System.out.println(cc + ":" + abc[i]);
				cc++;
			}
		}

	}

}