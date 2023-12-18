import java.util.Scanner;
public class Main{
	static long[] fact;
	static long mod;
	static long[] inv;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		mod=1000000007;
		fact=new long[100001];
		fact[1]=1;
		fact[0]=1;
		for(int i = 2; i<100001; i++){
			fact[i]=(fact[i-1]*i)%mod;
		}
		inv=new long[100001];
		inv[100000]=pow(fact[100000],mod-2);
		inv[0]=1;
		for(int i = 99999; i>0; i--){
			inv[i]=(inv[i+1]*(i+1))%mod;
		}
		long ans=0;
		for(int i = 0; i<w-b; i++){
			ans+=(comb(w+h-a-2-i,w-i-1)*comb(a-1+i,i))%mod;
		}
		System.out.println(ans);
	}
	static long comb(int t,int y){
		long re=1;
		re*=fact[t];
		re*=inv[y];
		re%=mod;
		re*=inv[t-y];
		return re%mod;
	}
	
	static long pow(long p,long q){
		long res=1;
		while(q>0){
			if((q & 1)==1){
				res*=p;
				res%=mod;
			}
			q>>=1;
			p*=p;
			p%=mod;
		}
		return res;
	}
}
