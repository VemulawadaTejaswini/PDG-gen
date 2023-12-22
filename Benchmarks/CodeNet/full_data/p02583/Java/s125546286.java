import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int noc=sc.nextInt(),len=noc,i=0,n=0;
		int[] a = new int[noc];
		while (noc-->0) a[i++]=sc.nextInt();
		Arrays.sort(a);
		for (i=0; i<len-2; i++) {
			for (int j=i+1; j<len-1; j++) {
				for (int k=j+1; k<len; k++) {
					if ((a[i]+a[j])>a[k]) {
						if ((a[i]!=a[j])&&(a[j]!=a[k])&&(a[i]!=a[k])) n++;
					}
				}
			}
		}
		System.out.println(n);
		sc.close();	
	}

	public static void main(String args[]) {
		solve();
	}

}
