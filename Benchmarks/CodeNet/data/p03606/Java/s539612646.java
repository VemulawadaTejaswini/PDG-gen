import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] lr = new int[n][2];
        for (int i = 0; i < n;i++){
            for (int j = 0; j < 2; j++){
                lr[i][j] = sc.nextInt();
            }
        }
        int result = 0;
        for (int i = 0;i < n;i++){
            result += lr[i][1] - lr[i][0] + 1;
        }
        System.out.println(result);
        sc.close();
    }
}