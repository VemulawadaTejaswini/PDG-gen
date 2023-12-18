import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		long a[]=new long[n+1];
		
		for(int i=1;i<=n;i++) {
			a[i]=sc.nextLong();
		}
		
		long c[][]=new long[20][n+1];
		for(int i=0;i<20;i++) {
			c[i][0]=0;
		}
		for(int j=0;j<20;j++) {
			int second=n+1;
			int latest=n+1;
				for(int i=n;i>=1;i--) {
					if((a[i]>>>j)%2==1) {
						second=latest;
						latest=i;
						
					}
					c[j][i]=second;
					
			}
//				for(int i=count;i<=n;i++) {
//					c[j][i]=n+1;
//				}
		}
		long ans=0;
		for(int i=1;i<=n;i++) {
			long m=n+1;
			for(int j=0;j<20;j++) {
				if(m>c[j][i]) {
					m=c[j][i];
				}
			}
			ans+=m-i;
		}
		
		System.out.println(ans);
		
		
	}
	
}


