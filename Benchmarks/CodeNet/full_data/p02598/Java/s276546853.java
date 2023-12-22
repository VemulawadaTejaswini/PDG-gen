import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long  K = sc.nextLong();
		int A[] = new int[N];
		for (int i=0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		long sum =0;
		for (int i=0;i<N;i++) {
			sum +=A[i];
		}
		long min =1;
		long max = sum/(K+1);
		long mid= 0;
		for (int i=0;i<100;i++) {
			mid = (min+max)/2;
			long num =0;
			for (int j=0;j<N;j++) {
				num +=A[j]/mid;
			}
			if (num <K+1) {
				max =mid;
			} else {
				min = mid;
			}
		}
		if (K>0) {
			System.out.println(mid+1);
		} else {
			System.out.println(mid);
		}

	}
}