import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		printAnswer();
	}

	private static void printAnswer() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try  {
			int count = Integer.valueOf(br.readLine());
			List<String> words = new ArrayList<>();

			for(int i = 0; i < count; i++){
				words.add(br.readLine());
			}
			Collections.sort(words);

			System.out.println(words.get(0));

		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				br.close();
			} catch (IOException e) {

			}
		}
	}
}