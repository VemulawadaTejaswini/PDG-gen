//Volume1-0102
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//initialization
        int[][] mat = null;
        String[] s;
        int n,i,j,
            row_sum,
            clm_sum;

        //input
        Scanner sc = new Scanner(System.in);
        while((n = Integer.parseInt(sc.nextLine())) != 0){
        	mat = new int[n+1][n+1];
        	for(i=0;i<n;i++){
        		s = sc.nextLine().split("\\s");
        		for(j=0;j<n;j++){
        			mat[i][j] = Integer.parseInt(s[j]);
        		}
        	}

        	//calculation
        	for(i=0;i<n+1;i++){
        		row_sum = 0;
        		clm_sum = 0;
        		for(j=0;j<n;j++){
        			row_sum += mat[i][j];
        			clm_sum += mat[j][i];
        		}
        		mat[j][i] = clm_sum;
        		mat[i][j] = row_sum;
        	}

        	//output
        	for(i=0;i<n+1;i++){
        		for(j=0;j<n+1;j++){
        			System.out.printf("%5d",mat[i][j]);
        		}
        		System.out.println();
        	}
        }
	}
}