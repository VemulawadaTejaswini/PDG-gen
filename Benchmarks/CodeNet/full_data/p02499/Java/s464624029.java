import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] count = new int[26];
		while(true) {
			if(sc.nextLine() != null) break;
			String line = sc.next();
			for(int i=0; i<line.length(); i++) {
				char s = line.charAt(i);
				if(s>='A' && s<='Z') {
					count[s-'A']++;
				} else if(s>='a' && s<='z') {
					count[s-'a']++;
				}
			}
		}
		for(int i=0; i<26; i++) {
			System.out.println((char)('a' + i) + " : " + count[i]);
		}
		sc.close();
	}
}