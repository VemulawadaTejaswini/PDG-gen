import java.util.Arrays;
import java.util.Scanner;

public class Main{
		static long mod = (long)1e9+7;

	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int[]A = new int [N];
			int[]C = new int [N];
			for(int i = 0;i<N;i++) {
				A[i] = scan.nextInt();
				C[i] = A[i];
			}
			
			Arrays.sort(C);
			
			if(N%2==1) {//奇数
				if(C[0]!=0) {
					System.out.println(0);
					System.exit(0);
				}
				
				for(int i = 1;i<N;i =i+2) {
					if(C[i]!=i+1||C[i+1]!=i+1) {
						System.out.println(0);
						System.exit(0);
						}
					}
					
					int k = N/2;
					
					System.out.println(mod_pow(2,k,mod));
					
				
				
			}else{//偶数
				for(int i = 0;i<N;i =i+2) {
					if(C[i]!=i+1||C[i+1]!=i+1) {
						System.out.println(0);
						System.exit(0);
						}
					}
				
				int k = N/2;
				
				
				System.out.println(mod_pow(2,k,mod));
				
				
				
				
			}
			
			
			
			
			
			
		}
		
		
		
		
		
	}
	
	
	
	private static long mod_pow(long x, long n ,long mod) {//Xのn乗を二分累乗法(繰り返し２乗法)で計算modもあり大きくしない
		long res = 1;
		    while(n > 0){
		        if((n&1)==1) {
		        	res = res*x%mod;
		        }
		        x = x*x%mod;
		        n >>= 1;
		    }
		    return res;
	}
	
		

}
