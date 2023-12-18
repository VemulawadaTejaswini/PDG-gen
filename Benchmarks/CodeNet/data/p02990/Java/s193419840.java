
import java.util.*;
public class Main {
	public static long mod;
	public static void main(String[] args) {
		mod = (long)(Math.pow(10, 9)+7);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
 
		for(int i=1;i<=K;i++){
			//long tmp = comb(N-K+1,i)*comb(K-1,i-1);
			long tmp1 = comb(N-K+1,i);
			long tmp2 = comb(K-1,i-1);
			long tmp =0;
			for(int j=0;j<tmp2;j++) {
				tmp += tmp1;
				tmp %= mod;
			}
			//tmp %= mod;
			System.out.println(tmp);
		}
 
	}
 
	//combination
	static long comb(int n, int r){
		if(r==0)return 1;
		else{
			long tmp = comb(n,r-1)%mod;
			return (long)((double)tmp/r*(n-r+1))%mod;
		}
	}
}