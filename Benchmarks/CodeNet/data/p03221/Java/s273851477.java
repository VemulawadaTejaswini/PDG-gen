import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int[][] A = new int[M][4];

		for(int i = 0 ; i < M ; i++){
			for(int j = 0 ; j < 2 ; j++){
				A[i][j] = sc.nextInt();
			}
		}

		sc.close();
		for(int i = 0 ; i < M ; i++){
			A[i][2] = i;
		}

	    Arrays.sort(A, new Comparator<int[]>() {
	        public int compare(int[] o1, int[] o2) {

	        	if(o1[0]==o2[0]){
	        		return o1[1] - o2[1];
	        	}
	        	else{
	        		return o1[0] - o2[0];
	        	}
	        }
	    });

	    A[0][3] = 1;

	    for(int i = 1 ; i < M ; i++){
	    	if(A[i-1][0] == A[i][0]){
	    		A[i][3] = A[i-1][3]+1;
	    	}
	    	else{
	    		A[i][3] = 1;
	    	}
	    }


	    Arrays.sort(A, new Comparator<int[]>() {
	        public int compare(int[] o1, int[] o2) {
	        		return o1[2] - o2[2];
	        }
	    });

	    for(int i = 0 ; i < M ; i++){
	    	System.out.println(String.format("%06d", A[i][0]) + String.format("%06d", A[i][3]));
	    }
	}
}
