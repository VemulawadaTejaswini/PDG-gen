
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	private static class List extends LinkedList<long[]> {
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int[] data = new int[26];
		while (sc.hasNext()) {
			String input = sc.next();
			for (int i = 0; i < input.length(); i++) {
				char c = input.charAt(i);
				if ('a' <= c && c <= 'z') {
					data[c - 'a']++;
				}else if('A' <= c && c <= 'Z'){
					data[c - 'A']++;
				}
			}
		}
		for (int i = 0; i < 26; i++) {
			System.out.println((char) ('a' + i) + " : " + data[i]);
		}
	}
}