
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		boolean[] data=makePrime();
		
		while(true) {
			int n=in.nextInt();
			if(n==0)break;
			
			int cnt=0;
			for(int i=n+1;i<=n*2;i++) {
				if(data[i])cnt++;
			}
			
			System.out.println(cnt);
		}
	}
	
	static boolean[] makePrime() {
		int n=123456*2+1,E=(int)Math.sqrt(n);
		boolean primes[]=new boolean[n];
		Arrays.fill(primes, true);
		
		for(int i=2;i<=E;i++) {
			if(primes[i]) {
				for(int j=i*2;j<n;j+=i)primes[j]=false;
			}
		}
		
		return primes;
	}

}

