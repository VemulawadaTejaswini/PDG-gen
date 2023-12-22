import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int[] dict = new int[26];
			while(sc.hasNextLine()) {
				String line = sc.nextLine().toLowerCase(); // 小文字に変換
				for(int i = 0; i < line.length(); i++) {
					char c = line.charAt(i);
					if(Character.isAlphabetic(c)) {
						dict[c - 'a']++;
					}
				}
			}
			for(int i = 0; i < dict.length; i++) {
				System.out.println((char)('a' + i) + " : " + dict[i]);
			}
		}
	}


}

