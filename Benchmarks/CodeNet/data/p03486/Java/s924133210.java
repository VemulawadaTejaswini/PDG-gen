import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		String [] ss = s.split("");
		String [] tt = t.split("");
		int x = 0;
		int l = ss.length;
		Arrays.sort(ss);
		Arrays.sort(tt, Collections.reverseOrder());
		if(ss.length > tt.length) {
			l = tt.length;
		}
			for(int i = 0; i < l; i++) {
				if(ss[i].compareTo(tt[i]) != 0) {
					x = i;
					break;
				}
			}
			if(ss.length < tt.length && x == 0) {
				System.out.println("Yes");
				}
			else if(ss.length >= tt.length && x == 0) {
				System.out.println("No");
			}
			else if(x != 0 && ss[x].compareTo(tt[x]) < 0) {
				System.out.println("Yes");
				}
			else {
				System.out.println("No");
			}
			sc.close();
	}
}
