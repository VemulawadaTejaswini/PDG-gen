import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		ArrayList<Integer> primes = new ArrayList<Integer>();
		long ans = 1;
		long mod = (long)(1e9+7);
		int[] cnts = new int[10001];
		for (int i = 2; i <= N; i++) {
			if (Prime(i)) primes.add(i);
		}
		for (int i = 1; i <= N; i++) { //i=factor
			for (int j = 0; j < primes.size(); j++) {
				int curfactor = i;
				while (curfactor%primes.get(j)==0) {
					cnts[primes.get(j)]++;
					curfactor/=primes.get(j);
				}
				if (curfactor==1) break;
			}
		}
		for (int i = 1; i <= N; i++) {
			int curchoices = cnts[i]+1;
			ans*=curchoices;
			ans%=mod;
		}
		System.out.println(ans);
	}
	public static boolean Prime(int N) {
		for (int i = 2; i*i<=N; i++) {
			if (N%i==0) return false;
		}
		return true;
	}
}