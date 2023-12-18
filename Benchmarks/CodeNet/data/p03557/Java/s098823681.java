
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}



	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long a[] = new long[n];
		long b[] = new long[n];
		long c[] = new long[n];

		for(int j=0; j<n; j++) {
			a[j]=sc.nextLong();
		}
		for(int j=0; j<n; j++) {
			b[j]=sc.nextLong();
		}
		for(int j=0; j<n; j++) {
			c[j]=sc.nextLong();
		}

		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);

		long bc[] = new long[n+1];
		int j=0;
		for(int i=0; i<n; i++) {
			while(j<n && b[i]>=c[j]) {
				j++;
			}
			bc[i+1]=bc[i] + n-j;
		}
		j=0;
		long cnt=0;
		for(int i=0; i<n; i++) {
			while(j<n && a[i]>=b[j]) {
				j++;
			}
			cnt += bc[n] - bc[j];
		}
		System.out.println(cnt);
		sc.close();
	}

}
