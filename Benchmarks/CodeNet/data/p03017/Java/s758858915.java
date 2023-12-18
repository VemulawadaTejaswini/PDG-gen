
import java.util.Scanner;

public class Main {


	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt()-1;
		int b = sc.nextInt()-1;
		int c = sc.nextInt()-1;
		int d = sc.nextInt()-1;
		
		String s = sc.next();
		
		if (c<d) {
			if (reachable(a,c,s) && reachable(b,d,s)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} else {
			if (reachable(a,c,s) && passable(b,d,s)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		


	}
	
	
	static boolean reachable(int start, int end, String s) {
		for (int i=start; i<end; i++) {
			if (s.charAt(i)=='#' && s.charAt(i+1)=='#') {
				return false;
			}
		}
		return true;
	}
	
	static boolean passable (int start, int end, String s) {
		for (int i=start; i<=end; i++) {
			if (s.charAt(i-1)=='.' && s.charAt(i)=='.' && s.charAt(i+1)=='.') {
				return true;
			}
		}
		return false;
	}
}