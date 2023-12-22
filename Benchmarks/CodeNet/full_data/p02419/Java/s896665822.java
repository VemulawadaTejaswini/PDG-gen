

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//ArrayList<String> word = new ArrayList<String>();
		String[] words;
		int wordCount = 0;
		String W = scan.nextLine();
		String T = "";
		
		
		
	
		while(true) {
			T = scan.nextLine();
			if(T.equals("END_OF_TEXT")) break;
			words = T.toLowerCase().split(" ");
			for (int j = 0; j < words.length; j++) {
				if(words[j].equals(W)){
					wordCount++;
				}
			}
			
		}
		
		
		System.out.println(wordCount);
		
		
	}
	

}