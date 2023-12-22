import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = null;
		InputStreamReader is = null;

		try {

			br = new BufferedReader(is = new InputStreamReader(System.in));

			String[] sentence = br.readLine().split(" ");
			int x = 0;
			int max = 0;
			String word = null;
			String longWord = sentence[0];

			for (int i = 0; i < sentence.length; i++) {

				for (int j = 0; j < sentence.length; j++) {

					if (sentence[i].equals(sentence[j])) {

						x++;

					}
					if (sentence[i].length() < sentence[j].length()) {

						longWord = sentence[j];

					}

				}
				if (max < x) {

					max = x;
					word = sentence[i];

				}

				x = 0;

			}

			StringBuffer sb =new StringBuffer();
			sb.append(word);
			sb.append(" ");
			sb.append(longWord);
			System.out.println(sb);

		} finally {
			br.close();
			is.close();

		}
	}
}