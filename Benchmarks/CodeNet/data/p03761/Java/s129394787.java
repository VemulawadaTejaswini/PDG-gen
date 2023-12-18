import java.nio.charset.IllegalCharsetNameException;
import java.util.*;
import java.lang.*;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		int[][] abc = new int[26][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < s[i].length(); j++) {
				abc[s[i].charAt(j) - 'a'][i]++;
			}
		}
		int[] min = new int[26];
		for (int i = 0; i < 26; i++) {
			min[i] = 50;
		}
		for (int i = 0; i < 26; i++) {
			for (int j = 0; j < n; j++) {
				min[i] = Math.min(abc[i][j], min[i]);
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 26; i++) {
			for (int j = 0; j < min[i]; j++) {
				sb.append((char)(i + 'a'));
			}
		}
		System.out.println(sb);
	}
}