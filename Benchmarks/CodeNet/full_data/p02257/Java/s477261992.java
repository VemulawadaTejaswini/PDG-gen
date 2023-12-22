import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
 
public class Main {
	public void exec() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        Prime p = new Prime();
        int n = Integer.parseInt(br.readLine());
        int[] v = new int[n];
        int max = 0;
        for(int i=0; i<n; i++) {
        	v[i] = Integer.parseInt(br.readLine());
        	if(max < v[i])
        		max=v[i];
        }
        p.checkPrime(10000);
        int countPrime = 0;
        for(int i=0; i<n; i++) {
        	if(p.isPrime(v[i]))
        		countPrime++;
        }
        out.println(countPrime);
        out.flush();
    }

    public static void main(String[] args) throws IOException {
        new Main().exec();
    }
}

class Prime {
	private static final int CAPACITY = 10001;
	private boolean[] isNotPrime = new boolean[CAPACITY];
	private int checkMax = 1;
	private int[] primes = new int[CAPACITY];
	private int ptrPrimes = 0;
	
	public boolean isPrime(int n) {
		if(CAPACITY*CAPACITY <= n) {
			throw new IllegalArgumentException();
		}else if(CAPACITY <= n){
			return checkPrimeSub(n);
		}else{
			return !isNotPrime[n];
		}
	}
	
	public void checkPrime(int target) {
		if(CAPACITY<target) throw new IllegalArgumentException();
		if(target<checkMax) return;
		for(int i=checkMax+1; i<=target; i++) {
			if (checkPrimeSub(i)) {
				primes[ptrPrimes++]=i;
			} else {
				isNotPrime[i]=true;
			}
		}
		checkMax=target;
	}
	
	public boolean checkPrimeSub(int i) {
		boolean isPrime = true;
		int maxPrime = i;
		for(int j=0; j<ptrPrimes; j++) {
			if(maxPrime <= primes[j]){
				break;
			}else if(i % primes[j] == 0) {
				isPrime = false;
				break;
			}else{
				maxPrime = i / primes[j];
			}
		}
		return isPrime;
	}
}