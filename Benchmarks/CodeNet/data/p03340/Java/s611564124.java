
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long a[] = new long[n];
		for(int i=0; i<n; i++) a[i]=sc.nextLong();
		final int MAX = 30;
		int r=0;
		long ans = 0;
		boolean f[] = new boolean[MAX];
		for(int l=0; l<n; l++) {
			if(l>0) {
				for(int i=0; i<MAX; i++) {
					if((a[l-1]>>i&1)==1) {
						f[i]=false;
					}
				}
			}
			while(r<n) {
				boolean ok=true;
				for(int i=0; i<MAX; i++) {
					if((a[r]>>i&1)==1) {
						if(f[i]) {
							ok=false;
							break;
						}
					}
				}
				if(ok) {
					for(int i=0; i<MAX; i++) {
						if((a[r]>>i&1)==1) {
							f[i]=true;
						}
					}
					r++;
				}else {
					break;
				}
			}
			ans += r-l;
		}
		System.out.println(ans);
		sc.close();
	}
}
