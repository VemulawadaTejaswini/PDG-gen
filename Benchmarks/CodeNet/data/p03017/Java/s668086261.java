import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt()-1;
		int B = sc.nextInt()-1;
		int C = sc.nextInt()-1;
		int D = sc.nextInt()-1;
		char[] S = sc.next().toCharArray();

		boolean ok = isReacheable(A, C, S, false) && isReacheable(B, D, S, D<C);
		
		System.out.println(ok ? "Yes" : "No");
		sc.close();
	}
	
	static boolean isReacheable(int s, int t, char[] c, boolean opponent) {
		boolean three = false;
		for(int i=s; i<t; i++) {
			if(i+1<=t && c[i+1]=='#') {
				if(i+2<=t && c[i+2]=='#') {
					return false;
				} else {
					i++;
				}
			} else {
				if(0<=i-1 && c[i-1]=='.' && c[i+1]=='.') {
					three = true;
				}
			}
		}
		if(0<t && t+1<c.length && c[t-1]=='.' && c[t+1]=='.') {
			three = true;
		}
		
		return !opponent || three;
	}
}