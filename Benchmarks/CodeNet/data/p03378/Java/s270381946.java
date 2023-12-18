import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt(), X = sc.nextInt();
		int[] A = new int[M];
		for (int i=0; i<M; i++){
			A[i] = sc.nextInt();
		}
		int costA = 0;
		int costB = 0;
		for (int i=X; i<N; i++){
			for (int j=0; j<M; j++){
				if (i==A[j]){
					costA++;
				}
			}
		}
		for (int i=X; i>0; i--){
			for (int j=0; j<M; j++){
				if (i==A[j]){
					costB++;
				}
			}
		}
		System.out.println(Math.min(costA, costB));

	}

}