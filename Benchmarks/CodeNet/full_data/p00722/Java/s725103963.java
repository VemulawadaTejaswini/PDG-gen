import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		solve();
	}

	private static void solve() {
		Scanner scn = new Scanner(System.in);
		PrintWriter pr = new PrintWriter(System.out);
		final int MAX = 1000000 + 1;
		boolean[] primes = new boolean[MAX];
		Arrays.fill(primes, true);
		primes[0] = false;
		primes[1] = false;
		for (int i = 2; i < MAX; i += 2) {
			primes[i] = false;
		}
		primes[2] = true;
		primes[3] = true;
		for (int i = 3; i * i < MAX; i += 2) {
			if (primes[i]) {
				for (int j = i * 2; j < MAX; j += i) {
					primes[j] = false;
				}
			}
		}
		Set<Integer> prm = new HashSet<Integer>();
		for(int k=0;k<MAX;k++){
			if(primes[k]){
				prm.add(k);
			}
		}

		while(true){
			int a = scn.nextInt();
			int d = scn.nextInt();
			int n = scn.nextInt();
			if(a==0&&d==0&&n==0) break;
			int count=0;
			while(true){
				if(prm.contains(a)) count++;
				if(count==n) {
					pr.println(a);
					break;
				}
				a+=d;
			}
		}
		pr.flush();
		scn.close();
	}



}