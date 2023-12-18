
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int C=sc.nextInt();
		int s[] = new int[N];
		int t[] = new int[N];
		int c[] = new int[N];

		int maxt = 0;
		for(int i=0; i<N; i++) {
			s[i]=sc.nextInt();
			t[i]=sc.nextInt();
			maxt = Math.max(maxt, t[i]);
			c[i]=sc.nextInt();
		}

		int sumt[] = new int[2*maxt+1];
		for(int i=1; i<=C; i++) {
			int tt[] = new int[2*maxt+1];
			for(int j=0; j<N; j++) {
				if(c[j]==i) {
					tt[2*s[j]-1]=1;
					tt[2*t[j]]=-1;
				}
			}
			for(int j=1; j<=2*maxt; j++) {
				tt[j] += tt[j-1];
			}

			for(int j=1; j<=2*maxt; j++) {
				sumt[j] += tt[j];
			}
		}
		long ans = 0;
		for(int i=1; i<=2*maxt; i++) {
			ans = Math.max(ans, sumt[i]);
		}
		System.out.println(ans);
		sc.close();
	}
}
