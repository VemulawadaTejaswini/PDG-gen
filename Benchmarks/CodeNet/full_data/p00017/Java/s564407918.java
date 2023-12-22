import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String S = sc.nextLine();
			String[] s = S.split(" ");
			for(int i = 0; i < 26; i++) {
				String[] t = new String[s.length];
				int[] g = new int[4];
				for(int j = 0; j < s.length; j++) {
					t[j] = func(s[j], i);
					g[check(t[j])]++;
				}
				if(g[0] >= 1 || g[1] >= 1 || g[2] >= 1) {
					for(int j = 0; j < s.length; j++) {
						if(j != s.length - 1) {
							System.out.printf("%s ", t[j]);
						}else {
							System.out.println(t[j]);
						}
					}
					break;
				}
			}
		}
		sc.close();
	}
	static int check(String s) {
		if(s.equals("the")) return 0;
		if(s.equals("this")) return 1;
		if(s.equals("that")) return 2;
		return 3;
	}
	static String func(String s, int k) {
		char[] c = s.toCharArray();
		int l = s.length();
		for(int i = 0; i < l; i++) {
			if(c[i] != '.') {
				c[i] = (char)((c[i] - 'a' + k) % 26 + 'a');
			}
		}
		return new String(c);
	}
}
