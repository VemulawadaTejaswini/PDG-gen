import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int query=0;query<T;++query){
			long A = sc.nextLong();
			long B = sc.nextLong();
			long C = sc.nextLong();
			long D = sc.nextLong();
			boolean ans = false;
			if(B>A || B>D) ans = false;
			else{
				A -= (A/B)*B;
				if(C<A) ans = false;
				else if(B-C<=1) ans = true;
				else{
					D = D%B;
					//System.out.println(A+" "+B+" "+C+" "+D);
					if(D==0) ans = true;
					else if(gcd(B,D)==1 || A%gcd(B,D)!=0) ans = false;
					else{
						B -= A;
						C -= A;
						long sabun = B/D - C/D;
						if(sabun == 0 || (sabun == 1 && B%D == 0)) ans = true;
						else ans = false;
					}
				}
			}

			System.out.println(ans?"Yes":"No");
		}
		return;
	}

	public static long gcd(long m, long n) {
		if(m < n) return gcd(n, m);
		if(n == 0) return m;
		return gcd(n, m % n);
	}
}