
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int A = scn.nextInt(), B = scn.nextInt(), C = scn.nextInt(), D = scn.nextInt();
		scn.nextLine();
		char[] ch = scn.nextLine().toCharArray();
		boolean can = true;
		if(A < B) {
			if(C < D) {
				can &= check(ch,B,D);
				can &= check(ch,A,C);
			}else {
				can &= check(ch,B,D);
				can &= check(ch,A,C);
				can &= check_space(ch,B,D);
			}
		}

		System.out.println(can?"Yes":"No");
	}

	public static boolean check(char[] ch, int S, int G) {
		boolean can = true;
		boolean before = false;
		for(int i = S;i < G;i++) {
			if(ch[i] == '#') {
				if(before) {
					can = false;
					break;
				}
				before = true;
			}else {
				before = false;
			}
		}

		return can;
	}

	public static boolean check_space(char[] ch, int S, int G) {
		boolean can = false;
		int count_space = 0;
		for(int i = S-1;i < G;i++) {
			if(ch[i] == '.') {
				count_space++;
				if(count_space==3) {
					can = true;
					break;
				}
			}else {
				count_space = 0;
			}
		}

		return can;
	}

}
