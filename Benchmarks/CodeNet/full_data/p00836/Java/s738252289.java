import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	static int count=1;
	static boolean[] isPrime = new boolean[10000000];
	static int[] primes = new int[100000];
	static int[] sum = new int[100000];
	static{
		Arrays.fill(isPrime, true);
		isPrime[0]=isPrime[1]=false;
		for(int i = 0; i*i<=isPrime.length; i++){
			if(isPrime[i]){
				primes[count]=i;
				sum[count]=sum[count-1]+primes[count];
				count++;
				for(int j = i+i; j < isPrime.length; j+=i){
					isPrime[j]=false;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int n = cin.nextInt();
			int cnt=0;
			if(n==0){
				break;
			}
			for(int i = 0; i < count; i++){
				for(int j = i+1;j < count; j++){
					if(sum[j]-sum[i]==n){
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
	}

}