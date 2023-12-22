//20200510 E
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt()%998244353;
		int k=sc.nextInt();
		long[] p=new long[k+1];
		p[0]=m;
		for(int i=0;i<n-1;i++){
			for(int j=k;j>0;j--){
				p[j]=(p[j-1]+p[j]*(m-1)%998244353)% 998244353;
			}
			p[0]=p[0]*(m-1)%998244353;
		}
		long ans=0;
		for(int i=0;i<k+1;i++){
			ans=(ans+p[i])% 998244353;
		}
		System.out.println(ans);
	}
}
