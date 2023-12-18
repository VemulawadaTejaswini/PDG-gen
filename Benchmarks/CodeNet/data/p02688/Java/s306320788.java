import java.util.*;
import java.io.*;
 
public class Main{
 
	public static void main(String[] $){
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int K = s.nextInt();
        int[] d = new int[K];
        int[][] A = new int[K][N];
        for(int i = 0; i < K; i++){
            d[i] = s.nextInt();
            for(int j = 0; j < d[i]; j++){
                A[i][j] = s.nextInt();
            }
        }

        boolean[] treat = new boolean[N];
        int T = N;
        for(int i = 0; i < K; i++){
            for(int j = 0; j < d[i]; j++){
                if(treat[A[i][j]-1] == false){
                    treat[A[i][j]-1] = true;
                    T--;
                }
            }
        }
        
        System.out.println(T);
        
        
	}
} 