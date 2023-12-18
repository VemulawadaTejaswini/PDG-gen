
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] A = new int[N+1][3];

		boolean S = true;
		for(int i = 1 ; i <= N ; i++){
			A[i][1] = sc.nextInt();
			A[i][2] = sc.nextInt();
			if(A[i][1] > A[i][2]){
				S = false;
				break;
			}
		}

		sc.close();

	    Arrays.sort(A, new Comparator<int[]>() {
	        public int compare(int[] o1, int[] o2) {
	            return o1[2] - o2[2];    //[0] をキーにソート(降順)
	        }
	    });

	    boolean T = true;
	    long AI = 0;
	    long BI = 0;
	    for(int i = 1 ; i <= N ; i++){
	    	AI += A[i][1];
	    	BI = Math.max(BI, A[i][2]);
	    	if(AI>BI){
	    		T = false;
	    		break;
	    	}
	    }

	    if(AI<=BI && S && T){
	    	System.out.println("Yes");
	    }
	    else{
	    	System.out.println("No");
	    }
	}
}
