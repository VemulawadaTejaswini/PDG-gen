import java.util.*;
public class Main{
	static long mod=1000000007;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		long ans=1;
		long xx=0;
		long yy=0;
		if(x>y){
			xx+=x-y;
			x-=xx*2;
			y-=xx;
		}else if(x<y){
			yy+=y-x;
			y-=yy*2;
			x-=yy;
		}
		if(x<0 || y<0){
			System.out.println(0);
			return;
		}
		if(x%3!=0 || y%3!=0){
			System.out.println(0);
			return;
		}
		
		xx+=x/3;
		yy+=x/3;
		long xk=1;
		long yk=1;
		for(long i=2; i<=xx+yy; i++){
			ans*=i;
			ans%=mod;
			if(i<=xx){
				xk*=i;
				xk%=mod;
			}
			if(i<=yy){
				yk*=i;
				yk%=mod;
			}
		}
		ans*=pow(xk,mod-2);
		ans%=mod;
		ans*=pow(yk,mod-2);
		ans%=mod;
		System.out.println(ans);
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
