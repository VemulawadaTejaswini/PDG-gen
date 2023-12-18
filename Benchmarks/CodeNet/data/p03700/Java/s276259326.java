
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long h[] = new long[n];
		for(int i=0; i<n; i++) {
			h[i]=sc.nextLong();
		}

		int l = -1;//できない
		int r = (int)1e9+1;//できる
		while(l+1<r) {
			int m = (l+r)/2;
			int cnt=0;
			for(int i=0; i<n; i++) {
				if(h[i]>b*m) {
					cnt += Math.ceil((double)(h[i]-(b*m))/(double)(a-b));
				}
			}
			if(cnt<=m) {
				r=m;
			}else {
				l=m;
			}
		}
		int ans = l+1;
		System.out.println(ans);
		sc.close();
	}


}


