import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long x,bal1,bal2,bal3,ans,kk;
		int n;
		Scanner in =new Scanner(System.in);
		n=in.nextInt();x=in.nextLong();
		long []  a=new long[n+1000];
		for(int i=1;i<=n;i++) {
			a[i]=in.nextLong();
		}
		ans=0;kk=-1;
		for(int i=1;i<=n;i++) {
			bal1=a[i];bal2=0;bal3=a[i];
			for(int k=1;k<n;k++) {
				int pi=((i-k) + n) % n;
				if(pi==0)pi=n;
				
				if(bal1>a[pi] + ((long)k)*x) {
					bal1=a[pi]+(k)*x;bal2=k;bal3=a[pi];
				}
			}
			if(bal2>kk)kk=bal2;
			ans+=bal3;
			
		}
		System.out.println(ans+(kk)*x);
	}

}
