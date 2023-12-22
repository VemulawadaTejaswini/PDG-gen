import java.awt.Point;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;
  
public class Main {
     
    static int N, M, L, K, A, H;
    static int[] FT;
    static int[] X, Y, T;
    
    static void start()
    {
    	// 最短経路を出す
    	int[][] wf = new int[N][N];
    	for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				wf[i][j] = Integer.MAX_VALUE / 2;
			}
		}
    	for (int i = 0; i < K; i++) {
			wf[ X[i] ][ Y[i] ] = wf[ Y[i] ][ X[i] ] = T[i];
		}
    	for (int k = 0; k < N; k++) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					wf[i][j] = Math.min(wf[i][j], wf[i][k] + wf[k][j]);
				}
			}
		}
    	
    	// 冷凍施設のある町と本国と姫だけの経路に変える
    	int[][] wf2 = new int[N][N];
    	for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				wf2[i][j] = Integer.MAX_VALUE / 2;
			}
		}
    	for (int i = 0; i < L; i++) {
    		for (int j = 0; j < L; j++) {
    			if(i == j)
    			{
    				if(0 <= wf[ FT[i] ][ A ] && wf[ FT[i] ][ A ] <= M)
    				{
    					wf2[ A ][ FT[i] ] = wf2[ FT[i] ][ A ] = wf[ FT[i] ][ A ];
    				}
    				
    				if(0 <= wf[ FT[i] ][ H ] && wf[ FT[i] ][ H ] <= M)
    				{
    					wf2[ H ][ FT[i] ] = wf2[ FT[i] ][ H ] = wf[ FT[i] ][ H ];
    				}
    			}
    			else
    			{
    				if(0 <= wf[ FT[i] ][ FT[j] ] && wf[ FT[i] ][ FT[j] ] <= M)
    				{
    					wf2[ FT[i] ][ FT[j] ] = wf[ FT[i] ][ FT[j] ];
    				}
				}
			}
		}
    	if(0 <= wf[ A ][ H ] && wf[ A ][ H ] <= M)
		{
    		wf2[ A ][ H ] = wf2[ H ][ A ] = wf[ A ][ H ];
		}
    	
    	for (int k = 0; k < N; k++) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					wf2[i][j] = Math.min(wf2[i][j], wf2[i][k] + wf2[k][j]);
				}
			}
		}
    	
    	if(wf2[A][H] == Integer.MAX_VALUE/2)
    		System.out.println("Help!");
    	else if(wf2[A][H] <= M) {
    		System.out.println(wf2[A][H]);
    	}
    	else {
    		System.out.println((wf2[A][H] - M)*2+M);
		}
    }
      
    public static void main(String[] args)
    {
        Scanner sca = new Scanner(System.in);
        
        while(true)
        {
            N = sca.nextInt();
            M = sca.nextInt();
            L = sca.nextInt();
            K = sca.nextInt();
            A = sca.nextInt();
            H = sca.nextInt();
            if(N == 0) break;
            
            FT = new int[L];
            for (int i = 0; i < L; i++) {
				FT[i] = sca.nextInt();
			}
            
            X = new int[K];
            Y = new int[K];
            T = new int[K];
            for (int i = 0; i < K; i++) {
				X[i] = sca.nextInt();
				Y[i] = sca.nextInt();
				T[i] = sca.nextInt();
			}
            
            start();
        }
         
    }
}