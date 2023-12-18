
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int w = in.nextInt();

        int[] arrW = new int[n];
        long[] arrV = new long[n];

        long[][] arr = new long[n+1][w+1];

        for (int i=0;i<n;i++){
            int tmp = in.nextInt();
            arrW[i]=tmp;
            long temp = in.nextLong();
            arrV[i] = temp;
        }

        for(int row=0;row<n+1;row++){
            for(int col=0;col<w+1;col++){
                if(row==0 || col==0) arr[row][col]=0;
                else if(col - arrW[row-1] >=0)  arr[row][col] = Math.max(arr[row-1][col], arr[row-1][col-arrW[row-1]] + arrV[row-1] );
                else arr[row][col] = arr[row-1][col];
            }

        }

        long ans = arr[n][w];
        System.out.println(ans);

    }
}
