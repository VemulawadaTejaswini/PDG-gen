import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		long m = sc.nextLong();
		long ans=1;
		long mod=1000000007;
		for(long i = 2; i<=m; i++){
			long o=0;
			while(m%i==0){
				m/=i;
				o++;
			}
			if(o!=0){
				long h=1;
				long y=1;
				for(long j = 1; j<=o;j++){
					h*=j;
					y*=o+n-j;
				}
				ans*=y/h;
			}
			if(m==1){
				break;
			}
		}
		System.out.println(ans%mod);
	}
}