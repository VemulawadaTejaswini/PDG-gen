import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();

		String A = sc.next();
		String B = sc.next();

		
		long tmp;
		long x=Math.max(N,M);
		long y=Math.min(N,M);
        while ((tmp = x % y) != 0) {
           	x = y;
           	y = tmp;
        }
        long gcd = y;

        long lcm = N*M/gcd;

        boolean f = true;
        outs:for(long n=0;n<N;n++){
        	if(n%(lcm/gcd)!=0) continue;
        	for(long m=0;m<M;m++){
        		if(m%(lcm/gcd)!=0) continue;
        		
        		if(A.charAt((int)n) != B.charAt((int)m)){ f = false; break outs;}
        	}
        }
        
       	if(f) System.out.println(lcm);
       	else System.out.println(-1);
		
	}
}