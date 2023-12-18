import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		long a[] = new long[N*3];
		for(int i=0;i<N*3;i++) {
			a[i] = sc.nextLong();
		}
		Arrays.sort(a);
		long sum =0;
		for (int i=N;i<2*N;i++) {
			sum +=a[i];
		}
		System.out.println(sum);
	}

}