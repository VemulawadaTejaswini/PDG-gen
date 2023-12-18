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
        for(long n=0,k=0;n<lcm;n+=(M/gcd)*(N/gcd),k++){
			if(A.charAt((int)(N/gcd*k)) != B.charAt((int)(M/gcd*k))){
        		f = false;
        		break;
        	}
        }
        
       	if(f) System.out.println(lcm);
       	else System.out.println(-1);
		
	}
}