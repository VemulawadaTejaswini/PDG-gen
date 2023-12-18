import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		StringBuilder sb1 = new StringBuilder("");
		StringBuilder sb2 = new StringBuilder("");
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
					sb1.append(s[i][2]);
				} else {
					sb2.append(s[i][2]);
				}
			}
		}
		if(order) {
			System.out.println(sb2.reverse() + S + sb1);
		} else {
			System.out.println(sb1.reverse() + S + sb2);
		}
	}
}
