
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Point{
	int x;
	int y;
	int z;
	Point(int a,int b,int c){
		this.x = a;
		this.y = b;
		this.z = c;
	}
}
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] A = new int[M][2];
		for(int i = 0 ; i < M ; i++){
			A[i][0] = sc.nextInt();
			A[i][1] = sc.nextInt();
		}

		sc.close();

		int[][] B = new int[M][2];
		for(int i = 0 ; i < M ; i++){
			B[i][0] = A[i][0];
			B[i][1] = A[i][1];
		}

	    Arrays.sort(B, new Comparator<int[]>() {
	        public int compare(int[] o1, int[] o2) {
	            return o1[1] - o2[1];
	        }
	    });
	    int AA = B[0][1];
    	int q = 0;
    	int count = 0;
    	int ans = 1;

    	outside:
	    while(true){
	    	for(int i = q ; i < M ; i++){
	    		if(AA > A[i][0]){
	    			count++;
	    		}else{
	    			AA = A[i][1];
	    			q = i;
	    			ans++;
	    			break;
	    		}
	    	}
	    	if(A[M-1][0] < AA){
	    		break outside;
	    	}
	    }

    	System.out.println(ans);
	}
}