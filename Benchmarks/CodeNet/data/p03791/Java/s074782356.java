import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long mod=1000000007;
		int num=0;
		long ans=1;
		for(int i=0; i<n; i++){
			int x=sc.nextInt();
			int next=2*num+1;
			num++;
			if(next>x){
				ans*=num;
				ans%=mod;
				num--;
			}
		}
		for(int i=num; i>=2; i--){
			ans*=i;
			ans%=mod;
		}
		System.out.println(ans);
	}
}
