import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void doIt() {
		long A = sc.nextLong();
		long B = sc.nextLong();
		A -= 1;
		long b = B;
		long ans = 0;
		int d = 0;
		while(b > 0) {
			long bnum = B % (2l << d) - (1l << d) + 1; 
			if(bnum < 0) bnum = 0;
			bnum += B / (2l << d) * (1l << d);
			long anum = A % (2l << d) - (1l << d) + 1;
			if(anum < 0) anum = 0;
			anum += A / (2l << d) * (1l << d);
			long num = bnum - anum;
			//System.out.println(bnum + ":" + anum);
			if(num % 2 != 0) {
				ans += 1l << d ;
				//System.out.println(ans + " : " + d + " " +  b);
			}
			d++;
			b /= 2;
		}
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
