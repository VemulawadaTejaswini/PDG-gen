import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		long[] a = new long[3*N];
		for(int i = 0; i < 3*N; i++) {
			a[i] = Long.parseLong(sc.next());
		}

		sc.close();

		for(int i =1; i <= 3*N-1; i++) {
			long w = a[i];
			int j = i;
			while(a[j-1] < w) {
				a[j] = a[j-1];
				j = j-1;
				if(j==0) break;
			}
			a[j] = w;
		}

		long sum = 0;
		int count = 0;
		for(int i = 1; count < N; i += 2) {
			sum += a[i];
			count++;
		}

		System.out.println(sum);
	}

}
