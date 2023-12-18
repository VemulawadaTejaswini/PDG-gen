import java.lang.reflect.Array;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] x = new int[N+1];
		x[0] = X;
		for (int i = 1; i < N+1; i++) {
			x[i] = sc.nextInt();
		}
		Arrays.sort(x);
		int[] y = new int[N];
		for (int i = 0; i < N; i++) {
			y[i] = x[i+1] - x[i];
		}
		if (y.length==1) {
			System.out.println(x[1]-x[0]);
			return;
		}
		// 最大公約数
		int g = gcd(y[0], y[1]);
		for (int i = 1; i < y.length-1; i++) {
			g = gcd(g, y[i+1]);
		}
		System.out.println(g);						
		
		
		// 入力
		/*
		String S = sc.next();                
		String T = sc.next();                
		
		for (int i = 0; i < S.length(); i++) {
			if (!S.substring(i,i+1).equals(T.substring(i,i+1))) {
				if (S.indexOf(T.substring(i,i+1)) == -1) {
					S = S.replace(S.substring(i,i+1), T.substring(i,i+1));
				} else {
					String s = S.substring(0, S.length());
					StringBuilder sb = new StringBuilder("");
					for (int j = 0; j < s.length(); j++) {
						if (s.substring(j, j+1).equals(S.substring(i, i+1))) {
							sb.append(T.substring(i, i+1));
						} else if (s.substring(j, j+1).equals(T.substring(i, i+1))) {
							sb.append(S.substring(i, i+1));							
						} else {
							sb.append(s.substring(j, j+1)); 
						}
					}
					S = sb.toString();
				}
			}
		}
		if(S.equals(T)){
			System.out.println("Yes");			
		} else {
			System.out.println("No");			
		}
	*/
	}	
	private static int gcd(int x, int y){
		if(y == 0){
			return x;
		}
		return gcd(y, x % y);
	}
	
}
