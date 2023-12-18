import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long mod = 1000000007;
		long ans1=1;
		long[] t1=new long[n];
		long[] a1=new long[n];
		long[] ans=new long[n];
		for(int i = 0; i<n; i++){
			t1[i] = sc.nextLong();
			if(i==0){
				ans[i]=t1[i];
			}else if(t1[i]!=t1[i-1]){
				ans[i]=t1[i];
			}
		}
		for(int i = 0; i<n; i++){
			a1[i] = sc.nextLong();
			if(ans[i]!=0){
				if(ti[i]>a1[i]){
					System.out.println(0);
					return;
				}
			}
			if(i==n-1){
				if(ans[i]!=0 && ans[i]!=a1[i]){
					System.out.println(0);
					return;
				}
				ans[i]=a1[i];
			}
			if(i!=0 && a1[i]!=a1[i-1]){
				if(ans[i-1]!=0 && ans[i-1]!=a1[i-1]){
					System.out.println(0);
					return;
				}
				ans[i-1]=a1[i-1];
				if(t1[i-1]<a1[i-1]){
					System.out.println(0);
					return;
				}
			}
		}
		for(int i = 0; i<n; i++){
			if(ans[i]==0){
				ans1*=Math.min(t1[i],a1[i]);
				ans1%=mod;
			}
		}
		System.out.println(ans1);
	}
}
