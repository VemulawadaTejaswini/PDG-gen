import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		StringBuilder s = new StringBuilder(sc.next());
		String t = sc.next(); boolean found = false;
		int sLen = s.length(), tLen = t.length();
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i)==t.charAt(0) && (i+tLen)<=sLen) {
				boolean ok = true;
				int j=0;
				while (j<tLen) {
					if (!(s.charAt(i+j)=='?' || t.charAt(j)==s.charAt(i+j))) {
						ok=false; break;
					}	
					j++;
				}
				if (ok) {
					s.replace(i, i+tLen, t);
					found = true; break;
				}
			}	
		}
		System.out.println(found ? s.toString().replaceAll("\\?","a") : "UNRESTORABLE");
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}