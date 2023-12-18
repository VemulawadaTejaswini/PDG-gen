import java.util.Scanner;
import java.util.Arrays;

public class Main{

	public static void main(String... args){
		Scanner scan = new Scanner(System.in);

		// input
		final int NUM = scan.nextInt();
		String[] words = new String[NUM];
		for(int i = 0; i < NUM; i++){
			words[i] = scan.next();
		}
		
		// sort
		Arrays.sort(words, (a, b) -> a.length() - b.length());
		
		// toCharArray
		char[][] wordsChar = new char[NUM][];
		for(int i = 0; i < NUM; i++){
			wordsChar[i] = words[i].toCharArray();
		}
		
		// check
		String answer = "";
		for(int i = 0; i < wordsChar[0].length; i++){
			char ch = wordsChar[0][i];
			int count = 0;
			for(int j = 0; j < NUM; j++){
				for(int k = 0; k < wordsChar[j].length; k++){
					if(wordsChar[j][k] == ch){
						count++;
						break;
					}
				}
			}
			if(count == NUM){
				answer = answer.concat(String.valueOf(ch));
			}
		}
		char[] answerChar = answer.toCharArray();
		Arrays.sort(answerChar);
		
		// answer
		for(int i = 0; i < answerChar.length; i++){
			System.out.print(answerChar[i]);
		}
		System.out.println("");
		
	}
		
}