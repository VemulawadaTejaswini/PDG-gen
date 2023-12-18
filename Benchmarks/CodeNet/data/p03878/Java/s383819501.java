import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a=new long[n];
		long[] b=new long[n];
		long mod=1000000007;
		for(int i=0; i<n; i++){
			a[i]=sc.nextLong();
		}
		for(int i=0; i<n; i++){
			b[i]=sc.nextLong();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		int oa=0;
		int ob=0;
		long ca=0;
		long cb=0;
		long ans=1;
		for(int i=0; i<2*n; i++){
			if(a[oa]<b[ob]){
				if(oa==n-1){
					oa=0;
					a[oa]=Long.MAX_VALUE;
				}else{
					oa++;
				}
				ca++;
			}else{
				if(ob==n-1){
					ob=0;
					b[ob]=Long.MAX_VALUE;
				}else{
					ob++;
				}
				cb++;
			}
			if(ca==cb){
				
				while(ca>0){
					ans*=ca;
					ca--;
					ans%=mod;
				}
				ca=0;
				cb=0;
			}
		}
		System.out.println(ans);
	}
}
