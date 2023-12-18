import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		char[] S = sc.next().toCharArray();
		char[] T = sc.next().toCharArray();
		if(S[0]!=T[0]){
			System.out.println("-1");
			System.out.flush();
			return;
		}
		int gcd = getGCD(N, M);
		int lcm = (N * M)/gcd;
		int n = M/gcd;
		int m = N/gcd;
		for(long i=0; i<lcm; i+=n){
			if(i%m==0 && S[(int)(i/n)]!=T[(int)(i/m)]){
				System.out.println("-1");
				System.out.flush();
				return;
			}
		}
		System.out.println(lcm);
	}
	private static int getGCD(int m, int n) {
        if(m < n){return getGCD(n, m);}
        if(n == 0){return m;}
        return getGCD(n, m%n);
    }
}