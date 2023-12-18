import java.util.*;

public class Main {
	static int gcd(int x,int y) {
		if (x<y)gcd(y,x);
		if (x%y==0)return y;
		return gcd(y,x%y);
	}
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n=Integer.parseInt(scan.next());
		int[] a=new int[n];
		for (int i=0;i<n;++i) {
			a[i]=Integer.parseInt(scan.next());
		}
		int ans=a[0];
		for (int i=1;i<n;++i) {
			ans=gcd(ans,a[i]);
		}
		
		System.out.print(ans);
}
}
//end
