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
		long lcm = getLCM(N, M);
		int n = (int) (lcm / N);
		int m = (int) (lcm / M);
		for(long i=0; i<lcm; i++){
			if(i%n==0 && i%m==0 && S[(int)(i/n)]!=T[(int)(i/m)]){
				System.out.println("-1");
				System.out.flush();
				return;
			}
		}
		System.out.println(lcm);
	}
	private static long getGCD(long m, long n) {
        if(m < n) return getGCD(n, m);
        if(n == 0) return m;
        return getGCD(n, m % n);
    }
    
    private static long getLCM(long m, long n) {
        return m * n / getGCD(m, n);
    }
}