import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long L = input.nextLong();
		long R = input.nextLong();
		long mod = 2019;
		long TotalDistance = R-L;
		long LDistance = mod-L%mod; //Above lowerbound
		long RDistance = R%mod; //Below upperbound
		TotalDistance-=LDistance;
		TotalDistance-=RDistance;
		if (TotalDistance>=2019) System.out.println(0);
		else {
			long ans = 2018;
			for (long l = L; l <= R;l++) {
				for (long r = l+1; r <= R; r++) {
					long curans = l*r;
					curans%=mod;
					ans = Math.min(ans, curans);
					//if (ans==curans) System.out.println(l+" "+r);
				}
			}
			System.out.println(ans);
		}
	}
}