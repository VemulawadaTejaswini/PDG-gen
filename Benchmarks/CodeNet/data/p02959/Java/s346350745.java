import java.util.*;

public class Main {
	
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n=Integer.parseInt(scan.next());
		int[] a =new int [n+1];
		int[] b =new int [n];
		for(int i=0;i<n+1;++i) {
			a[i]=Integer.parseInt(scan.next());
		}
		for(int i=0;i<n;++i) {
			b[i]=Integer.parseInt(scan.next());
		}
		
		int ans=0;
		int old=0;
		for (int i=0;i<n;++i) {
			if (old+b[i]>=a[i]) {
				ans+=a[i];
				old=b[i]-(a[i]-old);
			}else {
				ans+=old+b[i];
				old=0;
			}
		}
		if (a[n]<=old) {
			ans+=a[n];
		}else {
			ans+=old;
		}
		

		System.out.print(ans);
		
}
}
//end