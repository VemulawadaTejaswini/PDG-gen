import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		ArrayList<Long> yaku = new ArrayList<Long>();

		Scanner scn = new Scanner(System.in);
		long p = scn.nextLong(), q = scn.nextLong();
		scn.close();
		long qs;
		long ans = q;
		long bp = p,bq = q,buf = p;
		long r;

		while(bq % bp != 0) {
			buf = bq % bp;
			bq = bp;
			bp = buf;
		}

		for(long i = 1;i <= Math.sqrt(buf);i++) {
			if(buf%i==0) {
				yaku.add(i);
				yaku.add(buf/i);
			}
		}
		ans = q/buf;

		for(int i = 0;i < yaku.size();i++) {
			qs = q/yaku.get(i);
			for(int j = 50;j > 1;j--) {
				r = Math.round(Math.pow(qs,1/(double)(j)));
				if(Math.pow(r,j)==qs)ans = Math.min(ans, r);
			}
		}
		System.out.println(ans);
	}
}
