import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] sums = new int[26];
		String sentence;
		
		while ((sentence = br.readLine()) != null) {
			for (char sc : sentence.toLowerCase().toCharArray()) {
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