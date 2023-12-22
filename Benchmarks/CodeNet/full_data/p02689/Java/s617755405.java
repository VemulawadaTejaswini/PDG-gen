import java.util.*;
import java.io.*;
 
public class Main{
 
	public static void main(String[] $){
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        int[] H = new int[N];
        int[] A = new int[M];
        int[] B = new int[M];
        for(int i = 0; i < N; i++){
            H[i] = s.nextInt();
        }
        for(int i = 0; i < M; i++){
            A[i] = s.nextInt();
            B[i] = s.nextInt();
        }

        boolean[] check = new boolean[N];
        for(int i = 0; i < M; i++){
            if(H[A[i]-1] < H[B[i]-1]){
                check[B[i]-1] = false;
                check[A[i]-1] = true;
            }else if(H[A[i]-1] > H[B[i]-1]){
                check[B[i]-1] = true;
                check[A[i]-1] = false;
            }else{
                check[B[i]-1] = true;
                check[A[i]-1] = true;
            }
        }
        
        int T = 0;
        for(int i = 0; i < N; i++){
            if(check[i] == false){
                T++;
            }
        }
        
        System.out.println(T);
        
        
	}
} 