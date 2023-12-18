import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		boolean[] num=new boolean[1000001];
		if(n==2){
			System.out.println(1);
			return;
		}
		long ans=2;
		for(long i=2; i*i<=n; i++){
			if(n%i==0){
				long tmp=n;
				while(tmp%i==0){
					tmp/=i;
				}
				if(tmp%i==1){
					num[(int)i]=true;
				}
			}
		}
		for(long i=2; i*i<=n-1; i++){
			if((n-1)%i==0){
				num[(int)i]=true;
				if(i*i!=n-1){
					ans++;
				}
			}
		}
		for(int i=2; i<1000001; i++){
			if(num[i]){
				ans++;
			}
		}
		System.out.println(ans);
	}
}
