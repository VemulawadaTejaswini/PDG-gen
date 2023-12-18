import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();

		int[] A = new int[Q];

		for (int i=0; i<Q; i++){
			A[i] = sc.nextInt();
		}

		int[] point = new int[N];
		for (int i=0; i<N; i++){
			point[i] = K;
		}

		for (int i=0; i<Q; i++){
			for (int j=0; j<N; j++){
				if (j != A[i]-1){
					point[j]--;
				}
			}
		}
		for (int i=0; i<N; i++){
			if (point[i] > 0){
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}