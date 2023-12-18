import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		C(sc);
	}
	
	public static void A(Scanner sc) {
		int m = sc.nextInt();
		out.println(24-m+24);
	}
	
	public static void B(Scanner sc) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();
		Pattern p = Pattern.compile("[0-9]{"+ a + "}-[0-9]{" + b + "}");
		Matcher m = p.matcher(s);
		if(m.find()) out.println("Yes");
		else out.println("No");
	}
	
	// t+e%f == 0 満たす最初のe>0を求め、eを返す
	public static int rete(int t, int f) {
		return (int)Math.ceil(t/(double)f)*f - t;
	}
	
	//受け取ったi -> Nの所要時間を返す
	public static int calctime(int i, int[] S, int[] F, int[] C) {
		if(i==S.length) return 0;
		int t = S[i]+C[i];
		for(int j=i+1;j<S.length;j++) {
			if(t<=S[j]) t+=(S[j]-t)+C[j];
			else t+=rete(t,F[j])+C[j];
		}
		return t;
	}
	
	public static void C(Scanner sc) {
		int N = sc.nextInt();
		int[] C = new int[N-1];
		int[] S = new int[N-1];
		int[] F = new int[N-1];
		for(int i=0;i<N-1;i++) {
			C[i] = sc.nextInt();
			S[i] = sc.nextInt();
			F[i] = sc.nextInt();
		}
		for(int i=0;i<N;i++) {
			out.println(calctime(i,S,F,C));
		}
	}
}
