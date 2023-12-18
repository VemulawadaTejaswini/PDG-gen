import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long[]d=new long[n];
		for(int i=0;i<n;i++) {
			d[i]=sc.nextLong();
		}
		int m=sc.nextInt();
		Arrays.sort(d);
		long[]t=new long[m];
		for(int i=0;i<m;i++) {
			t[i]=sc.nextLong();
		}
		Arrays.sort(t);
		if(n<m) {
			System.out.println("NO");
			return;
		}else {
			int i=0;
			int j=0;
			int count=0;
			while(i<=n-1 && j<=m-1) {
				if(d[i]==t[j]) {
					i++;
					j++;
					count++;
				}else {
					j++;
				}
			}
			if(count==m) {
				System.out.println("YES");
				return;
			}else {
				System.out.println("NO");
				return;
			}
			
		}
	}
}
