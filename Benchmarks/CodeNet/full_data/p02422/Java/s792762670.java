import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			String word = sc.next();
			// 文字単位で操作しやすいように配列に
			char[] words = word.toCharArray();
			int n = sc.nextInt();
			for(int i = 0; i < n; i++) {
				String cmd = sc.next();
				switch(cmd) {  // 文字列に対し switch を使って良い
				case "replace": {
					int a = sc.nextInt();
					int b = sc.nextInt();
					char[] rs = sc.next().toCharArray();
					for(int j = a; j <= b; j++) {
						words[j] = rs[j-a];
					}
					break;  /* break を忘れない */
				}
				case "reverse": {
					int a = sc.nextInt();
					int b = sc.nextInt();
					while(a < b) {
						char t = words[a];
						words[a] = words[b];
						words[b] = t;
						a++; b--;
					}
					break;  /* break を忘れない */
				}
				case "print": {
					int a = sc.nextInt();
					int b = sc.nextInt();
					for(int j = a; j <= b; j++) {
						System.out.print(words[j]);
					}
					System.out.println();
					break;  /* break を忘れない */
				}
				}
			}
		}
	}
}

