import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void doIt() {
		String s = sc.next();
		char[] sa = s.toCharArray();
		int n = sa.length;
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			if(Integer.parseInt(s.substring(i, i + 1)) == i % 2) {
				cnt++;
			}
		}
		if(n - cnt < cnt) cnt = n - cnt;
		System.out.println(cnt);
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
