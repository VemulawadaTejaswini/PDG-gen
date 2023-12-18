
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	long C[][];
	public void init(int n) {
		C = new long[n+1][n+1];
		C[0][0]=1;
		for(int i=1; i<=n; i++) {
			C[i][0]=1;
			for(int j=1; j<=n; j++) {
				C[i][j] = C[i-1][j-1]+C[i-1][j];
			}
		}
	}

	private long com(int n, int k) {
		if(n<k) return 0;
		return C[n][k];
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		ArrayList<Long> v= new ArrayList<Long>();
		for(int i=0; i<n; i++) {
			v.add(sc.nextLong());
		}
		init(n);
		Collections.sort(v,Collections.reverseOrder());
		int acnt=0;
		int apos=0;
		for(int i=0; i<n; i++) {
			if(v.get(i) == v.get(a)) {
				acnt++;
				if(i<a) {
					apos++;
				}
			}
		}
		double ave = 0.0;
		for(int i=0; i<a; i++) {
			ave += v.get(i);
		}
		ave /= (double)a;
		System.out.println(String.format("%.6f", ave));

		long ans = 0;
		if(apos==a) {
			for(int i=a; i<=b; i++) {
				ans += com(acnt, i);
			}
		}else {
			ans = com(acnt, apos);
		}
		System.out.println(ans);
		sc.close();
	}

}
