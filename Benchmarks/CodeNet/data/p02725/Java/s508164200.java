import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int N = sc.nextInt();
		int a[] = new int[2000001];
		int kankaku[] = new int[2000002];
		int maxK = 0;
		long sumK = 0;

		a[0] = sc.nextInt();
		for(int i = 1; i<N; i++) {
			a[i] = sc.nextInt();
			kankaku[i-1] = a[i]-a[i-1];
			sumK = sumK + kankaku[i-1];

			if(i == 2) {
				maxK = Math.max(kankaku[i-1], kankaku[i]);
			}else if(i >= 3) {
				maxK = Math.max(maxK, kankaku[i]);
			}
		}
		kankaku[N-1] = K-a[N-1];
		sumK = sumK + kankaku[N-1] - maxK;

		System.out.println(sumK);
		sc.close();
	}
}