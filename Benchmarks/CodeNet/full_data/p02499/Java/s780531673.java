package programmingA;

import java.io.*;

public class Main {
	public static final int NUM_ALPHABET = 26; // アルファベットの数
	
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] count_alphabets = new int[NUM_ALPHABET];
		
		try {
			int c;
			while ((c = reader.read()) != -1) {
				if (Character.isAlphabetic((char)c)) {
					c = Character.toLowerCase(c);
					count_alphabets[c-'a']++;
				}
			}
			
			for (int i=0; i<NUM_ALPHABET; i++) 
				System.out.println((char)('a'+i)+" : "+count_alphabets[i]);

		} catch (IOException e) {
			System.out.println(e);
		}
		
	}
}