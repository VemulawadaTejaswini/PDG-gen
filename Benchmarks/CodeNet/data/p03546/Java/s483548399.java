import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int H = input.nextInt();
        int W = input.nextInt();
        int[][] c = new int[10][10];
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                c[i][j] = input.nextInt();
            }
        }
        int[][] A = new int[H][W];
        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                A[i][j] = input.nextInt();
            }
        }        
        int cost = 0;
        int costs[][];
        costs = Cost(c);
        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                if(A[i][j] !=-1 && A[i][j] != 1){
                    int temp = A[i][j];
                    cost = cost + costs[temp][1];
                }
            }
        }       
        System.out.println(cost);
    }

    private static int[][] Cost(int[][] cost){
        for(int k = 0; k < cost.length; k++){
            for(int i = 0; i < cost.length; i++){
                for(int j = 0; j < cost.length; j++){
                    if(cost[i][k] + cost[k][j] < cost[i][j]){
                        cost[i][j] = cost[i][k] + cost[k][j];
                    }
                }
            }
        }
        return cost;
    }
}