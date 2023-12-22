import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			long n = sc.nextLong(), m = sc.nextLong();
			if(n == 0 && m == 0) break;

			long i;
			for(i=0;i<=n;i++){
				long comb = c(n,i);
				if(m - comb > 0) m -= comb;
				else{
					if(m - comb == 0) m = comb;
					break;
				}
			}
			printAnswer("",n,i,m);
		}
	}
	
	static void printAnswer(String s,long n,long m,long rem){
		long comb = c(n-1,m);
		
		if(n == m){
			for(long i=0;i<m;i++) s += "1";
			System.out.println(s);
			return;
		}
		
		if(rem <= comb) printAnswer(s+"0",n-1,m,rem);
		else printAnswer(s+"1",n-1,m-1,rem-comb);			
	}
	
	static long c(long n, long r){
		long res = 1;
		for(long i=1;i<=r;i++) res = (res * (n-i+1)) / i;
		return res;
	}
}