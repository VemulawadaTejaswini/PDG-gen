import java.io.*;
import java.util.Scanner;

public class Main {
	
	
	public static void solution(String s1, String s2) {
		int s[][] = new int[s1.length()+1][s2.length()+1];
		for (int i = 0; i <= s1.length(); i++) {
			for (int j = 0; j <= s2.length(); j++) {
				if (i == 0 || j == 0) {
					s[i][j] = 0;
				}
				else if (s1.charAt(i-1) != s2.charAt(j-1)) {
					s[i][j] = Math.max(s[i-1][j], s[i][j-1]);
				}
				else {
					s[i][j] = s[i-1][j-1] + 1;
				}
			}
		}
		System.out.println(s[s1.length()][s2.length()]);
	}
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sets = in.nextInt();
		for (int i = 0; i < sets; i++) {
			String s1 = in.next();
			String s2 = in.next();
			solution(s1,s2);
		}
	}
}
