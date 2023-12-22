import java.awt.Point;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;
  
public class Main {
     
    static int N, M;
    static int[] A, B, COST, TIME;
    static int K;
    static int[] P, Q, R;
    
    static void start()
    {
    	int[][] cost = new int[M][M];
    	int[][] time = new int[M][M];
    	
    	for (int i = 0; i < M; i++) {
			for (int j = 0; j < M; j++) {
				cost[i][j] = Integer.MAX_VALUE/2;
				time[i][j] = Integer.MAX_VALUE/2;
			}
		}
    	
    	for (int i = 0; i < N; i++) {
			cost[A[i]-1][B[i]-1] = COST[i];
			cost[B[i]-1][A[i]-1] = COST[i];
			
			time[A[i]-1][B[i]-1] = TIME[i];
			time[B[i]-1][A[i]-1] = TIME[i];
		}
    	
    	for (int k = 0; k < M; k++) {
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < M; j++) {
					cost[i][j] = Math.min(cost[i][j], cost[i][k] + cost[k][j]);
					time[i][j] = Math.min(time[i][j], time[i][k] + time[k][j]);
				}
			}
		}
    	
    	for (int i = 0; i < K; i++) {
			if(R[i] == 0)
				System.out.println(cost[P[i]-1][Q[i]-1]);
			else {
				System.out.println(time[P[i]-1][Q[i]-1]);
			}
		}
    }
      
    public static void main(String[] args)
    {
        Scanner sca = new Scanner(System.in);
        
        while(true)
        {
            N = sca.nextInt();
            M = sca.nextInt();
            if(N == 0) break;
            
            A = new int[N];
            B = new int[N];
            COST = new int[N];
            TIME = new int[N];
            for (int i = 0; i < N; i++) {
				A[i] = sca.nextInt();
				B[i] = sca.nextInt();
				COST[i] = sca.nextInt();
				TIME[i] = sca.nextInt();
			}
            
            K = sca.nextInt();
            P = new int[K];
            Q = new int[K];
            R = new int[K];
            for (int i = 0; i < K; i++) {
				P[i] = sca.nextInt();
				Q[i] = sca.nextInt();
				R[i] = sca.nextInt();
			}
            
            start();
        }
         
    }
}