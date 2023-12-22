import java.util.*;

public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int noc = sc.nextInt(),n=noc,i=0,sum=0;
		int[] a = new int[noc];
		while (noc-->0) a[i++]=sc.nextInt();
		for (i=0; i<n-1; i++) {
			for (int j=i+1; j<n; j++) {
				sum+=((a[i]*a[j])%200003);
			}
		}
		System.out.println(sum);
		sc.close();
	}

	public static void main(String args[]) {
		solve();
	}

}
