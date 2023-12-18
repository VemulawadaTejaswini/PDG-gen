import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void doIt() {
		int cnt = 0;
		int n = sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();
		String r = "", l = "";
		for(int i = 0; i < q; i++) {
			String t = sc.next();
			if(sc.next().equals("L")){
				l = t.concat(l);
			}
			else r = t.concat(r);
		}
		int lcnt = 0;
		for(int i = 0; i < l.length(); i++) {
			if(l.charAt(i) == s.charAt(lcnt)) {
				lcnt++;
			}
		}
		int rcnt = 0;
		for(int i = 0; i < r.length(); i++) {
			if(r.charAt(i) == s.charAt(n - rcnt - 1)) {
				rcnt++;
			}
		}
		//System.out.println(l + " " + r);
		System.out.println(n - rcnt - lcnt);
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
