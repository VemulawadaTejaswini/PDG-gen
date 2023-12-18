import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		StringBuilder S = new StringBuilder(sc.next());
		int Q = Integer.parseInt(sc.next());
		String[][] s = new String[Q][3];
		for(int i = 0; i < Q; i++) {
			s[i][0] = sc.next();
			if(s[i][0].equals("1")) {
				s[i][1] = "0";
				s[i][2] = "0";
			} else {
				s[i][1] = sc.next();
				s[i][2] = sc.next();
			}
		}
		
		boolean order = true;
		
		for(int i = 0; i < Q; i++) {
			if(s[i][0].equals("1")) {
				order = !order;
			} else {
				boolean temp = order;
				if(s[i][1].equals("1")) {
					temp = !order;
				}
				if(temp) {
					S.append(s[i][2]);
				} else {
					S.insert(0, s[i][2]);
				}
			}
		}
		if(order) {
			System.out.println(S);
		} else {
			System.out.println(S.reverse());
		}
	}
}
