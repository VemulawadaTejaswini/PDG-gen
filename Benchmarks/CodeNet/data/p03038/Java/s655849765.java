
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] A = new int[N];
		for(int i = 0 ; i < N ; i++){
			A[i] = sc.nextInt();
		}
		int[][] S = new int[M][2];

		for(int i = 0 ; i < M ; i ++){
			S[i][0] = sc.nextInt();
			S[i][1] = sc.nextInt();
		}
		sc.close();

		Arrays.sort(A);

	    Arrays.sort(S, new Comparator<int[]>() {
	        public int compare(int[] o1, int[] o2) {
	            //return o1[0] - o2[0];    //[0] をキーにソート(昇順)
	            return o2[1] - o1[1];    //[1] をキーにソート(降順)
	        }
	    });

		for(int i = 0; i < M  ; i++){
			for(int j = 0 ; j < N ; j++){
				if(S[i][0] == 0){
					break;
				}
				else if(A[j] < S[i][1]){
					A[j] = S[i][1];
					S[i][0]--;
				}
			}
		}


		for(int i = 0 ; i < N ; i++){
			System.out.println(A[i]);
		}
	}
}