import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[][] X = new int[n][d];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < d; j++){
                X[i][j] = sc.nextInt();
            }
        }
        int[] dist = new int[n*(n-1)/2];
        int distsum = 0;
        int p = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                for(int k = 0; k < d; k++){
                    distsum = distsum + (X[i][k] - X[j][k]) * (X[i][k] - X[j][k]);
                }
                dist[p] = distsum;
                p++;
                distsum = 0;
            }
        }
        int count = 0;
        for(int i = 0; i < n*(n-1)/2; i++){
            for(int j = 1; j < 29; j++){
                if(dist[i] == j*j){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}