import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	private static final String endWord = "end_of_text";

	public static void main(String[] args) {
		printAnswer();
	}

	private static void printAnswer() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			int count = 0;
			String keyWord = br.readLine().toLowerCase();
			List<String> sentenceList = new ArrayList<>();

			while (true) {
				String sentence = br.readLine().toLowerCase();
				if (sentence.equals(endWord)) {
					break;
				}
				String s[] = sentence.split("[ .]");
				for(int i = 0; i < s.length; i++){
					sentenceList.add(s[i]);
				}
			}

			for(String contains : sentenceList){
				if(contains.equals(keyWord)){
					count++;
				}
			}

			System.out.println(count);

		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}