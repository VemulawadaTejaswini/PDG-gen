import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        int[][] X = new int[N+2][D+1];

        int c = 0;
        int num = 0 ;
        double sqrt = 0;
    
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= D; j++){
                X[i][j] = sc.nextInt();
                if(i == 1){
                    X[N+1][j] = X[i][j];
                }
            }
        }

        for(int i = 1; i <= N; i++){
           for(int j = 1; j <= D; j++){
                num += (X[i][j]-X[i+1][j]) * (X[i][j]-X[i+1][j]);  
           }
           sqrt = Math.sqrt(num);

           //System.out.println(i);
           //System.out.println(num);
           //System.out.println(sqrt);
           if(sqrt == (int)sqrt){
                c++;
           }
           num = 0;
        }

        System.out.println(c);
        
    }

}