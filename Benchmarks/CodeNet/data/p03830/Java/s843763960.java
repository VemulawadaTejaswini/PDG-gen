import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long[] prime = new long[200];
		prime[0] = 2;
		prime[1] = 3;
		int a = 2;
		for( int i=3; i<500; i+=2 ){
			for( int j=i-1; j>=3; j-- ){
				if( i%j==0 ){
					break;
				}
				if( j==3 ){
					prime[a]=i;
					a++;
				}
			}
		}
		long[] countPrime = new long[a];
		for( int i=2; i<=N; i++ ){
			for( int j=0; j<a; j++ ){
				long b = i;
				for( int k=0; k<i/2; k++ ){
					if( b%prime[j]==0 ){
						countPrime[j]++;
						b = b/prime[j];
					}else{
						break;
					}
				}	
			}         
		}
		long ans = 1;
		long mod = 1000000007L;      
		for( int i=0; i<a; i++ ){
			countPrime[i]++;          
			ans = ((ans%mod)*(countPrime[i]%mod))%mod;
		}    
		System.out.println(ans);
	}
}
