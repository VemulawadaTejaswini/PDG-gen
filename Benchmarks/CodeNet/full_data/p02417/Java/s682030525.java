import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		int[] cnt = new int[26];
		
		while(sc.hasNext()) {
			str = sc.nextLine();
			str = str.toLowerCase();
			char[] c = str.toCharArray();
			for(int i = 0; i < c.length; i++) {
				if('a' <= c[i] && c[i] <= 'z') {
					cnt[c[i] - 'a']++;
				}
			}
		}
		for(int i = 0; i < 26; i++) {
			System.out.println(((char)(i + 'a')) + " : " + cnt[i]);
		}
		//System.out.println();
	}
}