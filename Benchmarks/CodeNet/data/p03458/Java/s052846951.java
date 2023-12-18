
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		//2k 0～k-1=w, k～2k-1=b
		int n=sc.nextInt();
		int K=sc.nextInt();

		long x[] = new long[n];
		long y[] = new long[n];
		int c[] = new int[n];
		for(int i=0; i<n; i++) {
			x[i]=sc.nextLong();
			y[i]=sc.nextLong();
			if(sc.next().charAt(0)=='W') {
				c[i]=0;
			}else {
				c[i]=1;
			}
		}

		//W=0, B=1
		long ans = 0;
		for(int i=0; i<2*K; i++) {
			for(int j=0; j<2*K; j++) {
				int cc=0;
				int cnt=0;
				for(int k=0; k<n; k++) {
					if((x[k]+i)%(2*K)<K) {
						cc=0;
					}else {
						cc=1;
					}
					if((y[k]+j)%(2*K)>=K) {
						cc = (cc+1)%2;
					}
					if(cc==c[k]) {
						cnt++;
					}
				}
				ans = Math.max(ans, cnt);
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
