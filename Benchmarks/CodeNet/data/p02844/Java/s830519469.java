import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	final int LEN = 0;

	char ca[];
	int n;
	void doIt() {
		n = sc.nextInt();
		String  s = sc.next();
		ca = s.toCharArray();
		int cnt = 0;
		for(int i = 0; i < 1000; i++) {
			int num = i;
			char[] c = new char[3];
			c[0] = (char)(num / 100 + '0');
			num %= 100;
			c[1] = (char)(num / 10 + '0');
			num %= 10;
			c[2] = (char)(num + '0');
			if(ok(c))cnt++;
		}
		System.out.println(cnt);
	}

	boolean ok(char[] c) {
		int i = 0;
		for(int j = 0; j < n; j++) {
			if(ca[j] == c[i]) {
				i++;
				if(i == 3)break;
			}
		}
		return (i == 3)?true:false;
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
