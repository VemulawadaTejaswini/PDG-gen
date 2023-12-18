import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		//エラトステネスの篩により、素数を列挙する。
		int sieves[] = sieve(55555);
		
		List<Integer> primes = new ArrayList<Integer>();
		for(int i=0;i<sieves.length;i++) {
			if(sieves[i]==1)primes.add(i);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++) {
			sb.append(primes.get(i)+" ");
		}
		System.out.println(sb.toString());
	}
	
	//引数以下の素数を列挙し返すメソッド
	static int[] sieve(int N) {
		int primes[] = new int[N+1];
		Arrays.fill(primes, -1);
		primes[0]=primes[1]=0;
		for(int i=2;i<=N;i++) {
			if(primes[i]==-1) {
				primes[i]=1;
				for(int j=2*i;j<=N;j+=i) primes[j]=0;
			}
		}
		return primes;
	}
}
