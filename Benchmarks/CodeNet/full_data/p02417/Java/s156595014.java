import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] sums = new int[26];
		char[] sentence;
		
		while ((sentence = br.readLine().toLowerCase().toCharArray()).length > 0) {
			for (char sc : sentence) {
				for (char c = 'a', i = 0; c <= 'z'; c++, i++) {
					if (sc == c) sums[i]++;
				}
			}
		}
		
		for (char c = 'a', i = 0; c <= 'z'; c++, i++) {
			System.out.println(c + " : " + sums[i]);
		}
	}
}