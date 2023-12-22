import java.util.Scanner;

public class Main {

	static boolean[] prime=new boolean[300001];
	static void primes(int x) {
		for(int i=2; i*x<300000; i++) {
			prime[x*i]=false;
		}
	}

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int[] numprime=new int[300000];
			int k=0;
			for(int i=2; i<300000; i++) {
				prime[i]=true;
			}
			for(int i=2; i<300000; i++) {
				if(prime[i]) {
					if(i%7==1 || i%7==6) {
						numprime[k]=i;
						k++;
						primes(i);

					}
					else {
						prime[i]=false;
					}
				}
			}

			while(sc.hasNext()) {
				int n=sc.nextInt();
				if(n==1) break;
				int count=0;
				for(int i=0; i<k; i++) {
					if(numprime[i]<=n && n%numprime[i]==0) {
						if(count==0) {
							System.out.printf("%d: %d", n, numprime[i]);
							count++;
						}
						else {
							System.out.printf(" %d", numprime[i]);
						}
					}
				}
				System.out.println();


			}
		}
	}
}
