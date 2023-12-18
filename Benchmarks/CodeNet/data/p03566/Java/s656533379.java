
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int t[] = new int[n];
		int v[] = new int[n];

		int sumt[] = new int[n+1];
		sumt[0]=0;
		for(int i=0; i<n; i++) {
			t[i]=sc.nextInt();
			sumt[i+1]=sumt[i]+t[i];
		}
		for(int i=0; i<n; i++) {
			v[i]=sc.nextInt();
		}

		double maxv[] = new double[sumt[n]*2+1];
		int INF = 1001001;
		for(int i=0; i<maxv.length; i++) {
			maxv[i]=INF;
		}
		int now=0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<2*t[i]; j++) {
				maxv[now] = Math.min(maxv[now], v[i]);
				maxv[now+1] = Math.min(maxv[now+1], v[i]);
				now++;
			}
		}

		maxv[0]=0;
		maxv[sumt[n]*2]=0;

		for(int i=1; i<=sumt[n]*2; i++) {
			maxv[i]=Math.min(maxv[i], maxv[i-1]+0.5);
		}
		for(int i=sumt[n]*2-1; i>=0; i--) {
			maxv[i]=Math.min(maxv[i], maxv[i+1]+0.5);
		}
		double sum = 0.0;
		for(int i=1; i<=sumt[n]*2; i++) {
			sum += (maxv[i] + maxv[i-1]) * 0.25;
		}
		System.out.println(sum);
		sc.close();
	}


}
