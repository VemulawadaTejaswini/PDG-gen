import java.util.*;
public class Main{
	static long GCM(long a, long b){
		long p = Math.max(a, b);
		long q = Math.min(a, b);
		long r = p % q;
		while(r!=0){
			p = q;
			q = r;
			r = p % q;
		}
		return q;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		String s = sc.next();
		String t = sc.next();
		long g = GCM(n, m);
		long l = m / g * n;
		long a = n / g;
		long b = m / g;
		boolean bl = false;
		for(int i=0; i<g; i++){
			int id1 = (int)(i*a);
			int id2 = (int)(i*b);
			if(s.charAt(id1)!=t.charAt(id2)){
				bl = true;
				break;
			}
		}
		System.out.println(bl==false ? l : -1);
	}
}