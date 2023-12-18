import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		String T = scan.next();
		scan.close();
		int l = S.length();

		int[]R1 = new int[26];
		int[]R2 = new int[26];
		Arrays.fill(R1, -1);
		Arrays.fill(R2, -1);
		// 'a' = 97
		int[]s = new int[l];
		int[]t = new int[l];
		for(int i = 0; i < l; i++) {
			s[i] = (int)S.charAt(i) - 97;
			t[i] = (int)T.charAt(i) - 97;
		}
		for(int i = 0; i < l; i++) {
			if(R1[s[i]] >= 0) {
				if(R1[s[i]] != t[i]) {
					System.out.println("NO");
					System.exit(0);
				}
			}else {
				R1[s[i]] = t[i];
			}
			if(R2[t[i]] >= 0) {
				if(R2[t[i]] != s[i]) {
					System.out.println("NO");
					System.exit(0);
				}
			}else {
				R2[t[i]] = s[i];
			}
		}
		System.out.println("YES");
	}
}