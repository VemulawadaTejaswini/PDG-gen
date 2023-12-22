import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void io() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String src = sc.next();
			
			if( Integer.parseInt(src) == 0 ) break;
			
			solve(src);
		}
		
		sc.close();
	}
	
	void solve(String str) {
		int cnt = 0;
		while(true) {
			if( Integer.parseInt(str) == 6174 ) {
				System.out.println(cnt);
				break;
			}
			
			int len = str.length();
			char[] ss = str.toCharArray();
			char[] ls = new char[len];
			
			Arrays.sort(ss);
			for(int i = 0; i < len; ++i) {
				ls[i] = ss[len-1-i];
			}
			
			int l = Integer.parseInt(new String(ls));
			int s = Integer.parseInt(new String(ss));
			
			if( l == s ) {
				System.out.println("NA");
				break;
			}
			
			str = Integer.toString(l-s);
			while(str.length()<4) {
				str = "0" + str;
			}
			++cnt;
		}
	}
	
	public static void main(String[] args) {
		new Main().io();
	}
	
	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}