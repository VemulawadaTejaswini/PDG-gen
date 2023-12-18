import java.util.Scanner;

public class Main {
	int mod=1000000000+7;
	
	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]t=new int[n];
		int[]a=new int[n];
		for(int i=0;i<n;i++) {
			t[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		boolean[] fixed_T=new boolean[n];
		boolean[] fixed_A=new boolean[n];
		fixed_T[0]=true;
		fixed_A[n-1]=true;
		for(int i=0;i<n-1;i++) {
			if(t[i+1]>t[i])fixed_T[i+1]=true;
			else if(t[i+1]==t[i])continue;
			else {
				System.out.println(0);
				return;
			}
		}
		for(int i=n-1;i>0;i--) {
			if(a[i]<a[i-1])fixed_A[i-1]=true;
			else if(a[i]==a[i-1])continue;
			else {
				System.out.println(0);
				return;
			}
		}
		int unfixedCount=0;
		int start=0;
		int end=0;
		long ans=1;
		for(int i=0;i<n;i++) {
			if(!fixed_T[i] && !fixed_A[i]) {
				start=i;
				unfixedCount++;
			}else if(unfixedCount>0){
				end=i;
				int limit=Math.min(t[start-1], a[end]);
				ans*=calc_pow(limit, unfixedCount);
				ans%=mod;
				unfixedCount=0;
			}else if(fixed_T[i] && fixed_A[i]) {
				if(t[i]==a[i])continue;
				else {
					System.out.println(0);
					return;
				}
			}
		}
		System.out.println(ans);
		
	}
	long calc_pow(long a,long b) {
		long ans=1;
		for(int i=0;i<b;i++) {
			ans*=a;
			ans%=mod;
		}
		return ans%mod;
	}
	
}