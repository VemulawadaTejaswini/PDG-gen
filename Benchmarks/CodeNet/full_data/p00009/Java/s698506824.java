import java.util.*;

public class Main {
	public static void main(String args[]) {
		int MAX = 1000000;
		int [] primeLen = new int[MAX];
		boolean [] isPrime = new boolean[MAX];
		for (int i=2;i<MAX;i++) {
			isPrime[i] = true;
		}
		for (int i=2;i<(int)Math.sqrt(MAX)+1;i++) {
			if (isPrime[i]) {
				for (int j=i*i;j<MAX;j+=i) {
					isPrime[j] = false;
				}
			}
		}
		int cnt = 0;
		for (int i=0;i<MAX;i++) {
			if (isPrime[i]) cnt++;
			primeLen[i] = cnt;
		}
		Scanner s = new Scanner(System.in);
		while (s.hasNext()) {
			int n = s.nextInt();
			System.out.println(primeLen[n]);
		}
	}
}

