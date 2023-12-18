import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		long[]t=new long[N];
		long max=0;
		for(int i=0;i<N;i++){
			t[i]=sc.nextLong();
			if(t[i]>max)max=t[i];
		}
		long ans=max;
		for(int i=0;i<N;i++){
			if(ans%t[i]!=0){
				ans=gcd(ans,t[i]);
			}
		}
		System.out.println(ans);
	}
	
	long gcd(long a, long b){
		long tempa=a;
		long tempb=b;
		long r=a%b;
		while(r!=0){
			a=b;
			b=r;
			r=a%b;
		}
		return tempa*tempb/b;
	}
	
}