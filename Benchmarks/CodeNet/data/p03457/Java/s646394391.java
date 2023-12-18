
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long t[] = new long[n+1];
		long x[] = new long[n+1];
		long y[] = new long[n+1];
		t[0]=0;
		x[0]=0;
		y[0]=0;
		n++;
		for(int i=1; i<n; i++) {
			t[i]=sc.nextLong();
			x[i]=sc.nextLong();
			y[i]=sc.nextLong();
		}
		for(int i=1; i<n; i++) {
			long tt= t[i]-t[i-1];
			long xx = Math.abs(x[i]-x[i-1]);
			long yy = Math.abs(y[i]-y[i-1]);

			if(tt<xx+yy || (tt-(xx+yy))%2!=0) {
				System.out.println("No");
				sc.close();
				return;
			}
		}
		System.out.println("Yes");
		sc.close();
	}
}
