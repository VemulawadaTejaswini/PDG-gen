import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		long n = parseLong(sc.next());
		long m = parseLong(sc.next());
		sc.close();
		long g = gcd(n,m);
//		long mx = (long)pow(g,0.5);
		long mx = g/2;
		ArrayList<Long> pr = new  ArrayList<>();
		pr.add(2L);
		for (long k = 3L; k <= mx; k+=2L) {
			boolean f=true;
			for (Long ll:pr) {
				if(k%ll==0) {
					f=false;
					break;
				}
			}
			if(f) {
				pr.add(k);
			}
		}
		long cnt = 1;
		for (Long ll:pr) {
			if(g%ll==0) {
				cnt++;
			}
		}
		out.println(cnt);
	}
	public static long gcd(long a, long b) {
		long tmp;
		while((tmp = a%b)!=0) {
			a = b;
			b = tmp;
		}
		return b;
	}

}
