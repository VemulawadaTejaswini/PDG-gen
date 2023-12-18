import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] x = new int[2][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < 2 ; j++){
                x[j][i] = sc.nextInt();
            }
        }
        sc.close();
        double yono = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < i ; j++){
                yono += Math.sqrt((x[0][j] - x[0][i]) * (x[0][j] - x[0][i]) + (x[1][j] - x[1][i]) * (x[1][j] - x[1][i]));
            }
        }
        System.out.println(yono * 2 / n);
    }
}