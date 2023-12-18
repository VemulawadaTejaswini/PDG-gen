
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		for(int i=1;i<=K;i++){
			long tmp = comb(N-K+1,i)*func(K,i);
			System.out.println(tmp);
		}

	}
	
	//n個の同じボールをk分割する方法
	static long func(int n, int k){
		if(n<k)return 0;
		if(n==k)return 1;
		else if(k==1)return 1;
		else{
		 long tmp = 0;
		 for(int i=1;i<=n-k+1;i++){
			 tmp+=func(n-i,k-1);
		 }
		 return tmp;
		}
	}
	
	//combination
	static long comb(int n, int k){
		if(n<k)return 0;
		double tmp = 1;
		for(int i=0;i<k;i++){
			tmp*=(n-i);
			tmp/=(k-i);
		}		
		return (long)tmp;
	}
}
