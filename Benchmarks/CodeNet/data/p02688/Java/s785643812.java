import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] d = new int[K];
		int[] A = new int[N];

		for(int i=0; i<K; i++) {
			d[i] = sc.nextInt();
			for(int j=0; j<d[i]; j++) {
				int s = sc.nextInt();
				A[s-1]++;
			}
		}
		sc.close();
		int k=0;
		for(int i=0; i<N; i++) {
			if(A[i]==0) {
				k++;
			}
		}
		System.out.println(k);
	}

}