
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		int f[] = new int[n];
		for(int i=0; i<n; i++) a[i] = sc.nextInt();

		for(int i=0; i<n-2; i++) {
			int s = 1;
			if(f[i]%2==1) {
				s = -1;
			}
			if(a[i]*s<0) {
				f[i]++;
				f[i+1]++;
			}
		}

		int s2 = f[n-2]%2==0 ? 1 : -1;
		int s1 = f[n-1]%2==0 ? 1 : -1;

		if(a[n-2]*s2<=0 && a[n-1]*s1<=0) {
			f[n-2]++;
			f[n-1]++;
		}
		else if(a[n-2]*s2<0 && Math.abs(a[n-2])>Math.abs(a[n-1])) {
			f[n-2]++;
			f[n-1]++;
		}
		else if(a[n-1]*s1<0 && Math.abs(a[n-1])>Math.abs(a[n-2])) {
			f[n-2]++;
			f[n-1]++;
		}

		long ans = 0;
		for(int i=0; i<n; i++) {
			int s = f[i]%2==0 ? 1 : -1;
			ans += (long)a[i]*(long)s;
		}
		System.out.println(ans);
		sc.close();
	}

}
