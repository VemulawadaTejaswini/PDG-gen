import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Map<String, Integer> dict = new HashMap<String, Integer>();

		String line = br.readLine();
		String[] words = line.split("\\s");
		for (int i = 0 ; i < words.length ; i++) {
			if (!dict.containsKey(words[i])) {
				dict.put(words[i], 1);
			} else {
				dict.put(words[i], dict.get(words[i])+1);
			}
		}


		String longest = "";
		String max_word = "";
		long max = 0;
		for (String key : dict.keySet()) {
			if (key.length() > longest.length()) longest = new String(key);
			if (max < dict.get(key)) {
				max = dict.get(key);
				max_word = new String(key);
			}
		}
		System.out.println(max_word+" "+longest);

	}
}