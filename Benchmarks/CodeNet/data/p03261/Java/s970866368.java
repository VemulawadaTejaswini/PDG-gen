import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String currentWord = sc.next();
		List<String> words = new ArrayList<>();
		words.add(currentWord);
		
		String lastWord = "";
		
		for (int i = 0; i < N - 1; i++) {
			currentWord = sc.next();
			if (words.contains(currentWord)) {
				System.out.println("No");
				return;
			}
			lastWord = words.get(words.size() - 1);
			if (lastWord.substring(lastWord.length() - 1).equals(currentWord.substring(0, 1))) {
				words.add(currentWord);
			} else {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}
