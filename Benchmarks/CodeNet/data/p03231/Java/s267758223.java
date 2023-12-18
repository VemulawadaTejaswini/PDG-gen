import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		String A = sc.next();
		String B = sc.next();

		
		int tmp;
		int x=Math.max(N,M);
		int y=Math.min(N,M);
        while ((tmp = x % y) != 0) {
           	x = y;
           	y = tmp;
        }
        int gcd = y;
        long lcm = M*N/gcd;
        boolean f = true;
        outs:for(int n=0;n<N;n++){
        	if(n%((long)N/gcd*(long)M/gcd)!=0) continue;
        	for(int m=0;m<M;m++){
        		if(m%((long)N/gcd*(long)M/gcd)!=0) continue;
        		
        		if(A.charAt(n) != B.charAt(m)){ f = false; break outs;}
        	}
        }
        
       	if(f) System.out.println(lcm);
       	else System.out.println(-1);
		
	}
}