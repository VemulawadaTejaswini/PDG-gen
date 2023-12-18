import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		int n = s.length;
		long k = sc.nextLong();

		char[] _s = s.clone();
		Arrays.sort(_s);
		if(_s[0] == _s[n-1]) { //every char is the same
			long _n = n;
			System.out.println((_n*k)/2);
		}
		else {
			if(s[0] == s[n-1]) {
				long a = 1;
				for(int i = 1; i < n; i++) {
					if(s[i] == s[0]) a++;
					else break;
				}
				long b = 1;
				for(int i = n-2; i >= 0; i--) {
					if(s[i] == s[0]) b++;
					else break;
				}
				ArrayList<Long> sizes = new ArrayList<Long>();
				int last = (int)a;
				long siz = 1;
				for(int i = (int)a+1; i < n; i++) {
					if(s[i] == s[last]) siz++;
					else {
						sizes.add(siz);
						siz = 1;
						last = i;
					}
				}
				long res = 0; 
				for(long ss: sizes) {
					res += ss / 2;
				}
				res *= k;
				res += ((a+b)/2) * (k-1);
				res += a / 2 + b / 2;
				System.out.println(res);
			}
			else {
				ArrayList<Long> sizes = new ArrayList<Long>();
				int last = 0;
				long siz = 1;
				for(int i = 1; i < n; i++) {
					if(s[i] == s[last]) siz++;
					else {
						sizes.add(siz);
						siz = 1;
						last = i;
					}
				}
				sizes.add(siz);
				long res = 0;
				for(long ss: sizes) {
					res += ss / 2;
				}
				res *= k;
				System.out.println(res);
			}
		}
	}

}
