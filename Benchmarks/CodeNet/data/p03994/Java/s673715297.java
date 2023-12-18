import static java.lang.Math.*;
import static java.util.Arrays.*;
 
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 
import static java.math.BigInteger.*;
 
public class Main {
	
	void solve() {
		char[] s = sc.next().toCharArray();
		int n = s.length;
		long K = sc.nextLong();
		
		for (int i = 0; i < n; i++) {
			int need = (1 + 'z' - s[i]) % 26;
			if (need <= K) {
				s[i] = 'a';
				K -= need;
			}
		}
		if (K > 0) { K %= 26; }
		while (K-->0) {
			if (s[n-1] == 'z') s[n-1] = 'a'; else s[n-1]++;
		}
		System.out.println(new String(s));
	}
 
	public static void main(String[] args) throws Exception {
		new Main().run();
	}
 
	Scanner sc = null;
	public void run() throws Exception {
		sc = new Scanner(System.in);
		solve();
	}
 
}