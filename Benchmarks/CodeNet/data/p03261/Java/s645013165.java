import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> wordList = new ArrayList<String>();
		String beforeWord = sc.next();
		wordList.add(beforeWord);
		for(int i =1;i <n;i++) {
			String word = sc.next();
			if(!beforeWord.substring(beforeWord.length()-1).equals(
					word.substring(0, 1))) {
				System.out.println("No");
				return;
			}
			if(wordList.indexOf(word) != -1) {
				System.out.println("No");
				return;
			}
			wordList.add(word);
			beforeWord = word;
		}
		System.out.println("Yes");
	}
}