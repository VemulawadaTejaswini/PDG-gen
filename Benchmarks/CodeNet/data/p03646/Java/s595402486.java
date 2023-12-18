import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		long k = sc.nextLong();
		int n=50;
		long a[] = new long[n];
		for(int i=0; i<n; i++) {
			a[i]=i;
		}
		long cnt = k/n;
		for(int i=0; i<n; i++) {
			a[i]+=cnt;
		}
		int amari = (int)(k%n);
		for(int i=0; i<amari; i++) {
			a[i] += 50;
			a[i] -= (amari-1);
		}
		for(int i=amari; i<n; i++) {
			a[i] -= (amari);
		}
		Arrays.sort(a);
		System.out.println(n);
		for(int i=0; i<n; i++) {
			if(i>0) System.out.print(" ");
			System.out.print(a[i]);
		}
		System.out.println();
		sc.close();
	}
}
