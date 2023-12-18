import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] candy = new int[2][N];
        for(int h=0; h<2; h++) for(int w=0; w<N; w++) candy[h][w]=sc.nextInt();

        int[][] sum = new int[2][N];
        sum[0][0] = candy[0][0];
        sum[1][0] = sum[0][0] + candy[1][0];
        for(int w=1; w<N; w++){
            sum[0][w] = sum[0][w-1] + candy[0][w];
            sum[1][w] = Math.max(sum[0][w], sum[1][w-1]) + candy[1][w];
        }

        System.out.println(sum[1][N-1]);

    }
}
