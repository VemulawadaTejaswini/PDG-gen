import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] words = str.split(" ");
		int[] times = new int[words.length];
		int max = 0;
		int maxleng = 0;
		int maxlengindex = -1;
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > maxleng) {
				maxleng = words[i].length();
				maxlengindex = i;
			}
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					times[i]++;
					if (times[i] > max)
						max = times[i];
				}
			}
		}
		for (int i = 0; i < words.length; i++)
			if (times[i] == max)
				System.out.print(words[i] + " ");
		System.out.println(words[maxlengindex]);
	}
}