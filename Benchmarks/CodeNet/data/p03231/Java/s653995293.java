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
        for(long n=0,k=0;n<lcm;n+=(M/gcd)*(N/gcd),k++){
			if(A.charAt(N/gcd*(int)k) != B.charAt(M/gcd*(int)k)){
        		f = false;
        		break;
        	}
        }
       	if(f) System.out.println(lcm);
       	else System.out.println(-1);
		
	}
}