import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		int count = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		while(true) {
			String sentence = br.readLine();
			if (sentence.equals("END_OF_TEXT")){
				break;
			}
			String[] sentence_word = sentence.split(" ");
			for (int i = 0;i < sentence_word.length;i++){
				if (sentence_word[i].equalsIgnoreCase(word)){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}