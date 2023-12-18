import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String S = sc.next();
		int[] abc = new int[26];
		for(int j = 0; j < S.length(); j++)
			abc[S.charAt(j)-97] += 1;
		StringBuilder ans = new StringBuilder();
		for(int i = 1; i < n; i++) {
			S = sc.next();
			int[] nextabc = new int[26];
			for(int j = 0; j < S.length(); j++)
				nextabc[S.charAt(j)-97] += 1;
			for(int j = 0; j < 26; j++)
				abc[j] = Math.min(abc[j], nextabc[j]);
		}
		for(int i = 0; i < 26; i++) {
			for(int j = 0; j < abc[i]; j++)
				ans.append((char)(i+97));
		}
		System.out.println(ans);
	}

}