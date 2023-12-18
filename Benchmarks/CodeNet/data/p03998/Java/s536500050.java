import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		int turn = 1;
		int ac = 0;
		int bc = 0;
		int cc = 0;
		boolean check = true;
		while(check == true) {
			if(ac >= a.length() || bc >= b.length() || cc >= c.length()) {
				check = false;
				continue;
			}
			if(turn == 1 && ac < a.length()) {
				if(a.charAt(ac) == 'a') {
					ac++;
					continue;
				}else if(a.charAt(ac) == 'b') {
					turn = 2;
					ac++;
					continue;
				}else if(a.charAt(ac) == 'c') {
					turn = 3;
					ac++;
					continue;
				}
			}
			if(turn == 2 && bc < b.length()) {
				if(b.charAt(bc) == 'a') {
					turn = 1;
					bc++;
					continue;
				}else if(b.charAt(bc) == 'b') {
					bc++;
					continue;
				}else if(b.charAt(bc) == 'c') {
					turn = 3;
					bc++;
					continue;
				}
			}
			if(turn == 1 && cc < c.length()) {
				if(c.charAt(cc) == 'a') {
					turn = 1;
					cc++;
					continue;
				}else if(c.charAt(cc) == 'b') {
					turn = 2;
					cc++;
					continue;
				}else if(c.charAt(cc) == 'c') {
					cc++;
					continue;
				}
			}
		}
		if (turn == 1) {
			System.out.println("A");
		}else if (turn == 2) {
			System.out.println("B");
		}else if (turn == 3) {
			System.out.println("C");
		}
	}
}
