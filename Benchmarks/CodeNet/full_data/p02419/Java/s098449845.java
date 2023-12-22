package aoj.lesson9.a;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//ArrayList<String> word = new ArrayList<String>();
		int wordCount = 0;
		String W = scan.nextLine();
		String T = scan.nextLine();
		String[] words;
		
	
		while(true) {
			if(scan.nextLine().equals("END_OF_TEXT")) break;
			words = scan.nextLine().toLowerCase().split(" ");
			for (int j = 0; j < words.length; j++) {
				if(words[j].equals(W)){
					wordCount++;
				}
			}	
		}
		
		
		System.out.println(wordCount);
		
		
	}
	

}

//teishu
//next scanner???