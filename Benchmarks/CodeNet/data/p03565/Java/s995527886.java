import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		if(!check(s,t)) {
			System.out.println("UNRESTORABLE");
			return;
		}
		int N = s.length;
		for(int i = 0 ; i < N ; i++) {
			if(s[i] == '?') {
				for(char c = 'a' ; ; c++) {
					s[i] = c;
					if(check(s, t)) break;
				}
			}
		}
		System.out.println(String.valueOf(s));
	}

	public static boolean check(char[] s, char[] t) {
		int N = s.length;
		int M = t.length;
		for(int i = 0 ; i + M <= N ; i++) {
			boolean ok = true;
			for(int j = 0 ; j < M ; j++) {
				if(s[i + j] == '?' || s[i + j] ==t[j]);
				else ok = false;
			}
			if(ok) return true;
		}
		return false;
	}
}