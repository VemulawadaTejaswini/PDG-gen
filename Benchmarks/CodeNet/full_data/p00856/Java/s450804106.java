import java.awt.Point;
import java.awt.event.FocusAdapter;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import javax.naming.InitialContext;
 
public class Main {
     
	static int N, T, L, B;
	static int[] Lose, Back;
	
    static void start()
    {
    	double[][] dp = new double[T+1][N+1];
    	
    	for (int turn = 0; turn <= T; turn++) 
    		for(int index = 0; index <= N;index++)
    			dp[turn][index] = 0;
    	dp[0][0] = 1;
    	
    	for (int turn = 0; turn < T; turn++) 
    		for(int index = 0; index < N;index++)
    			for (int dice = 1; dice <= 6; dice++) 
    			{
					int nextindex = index + dice;
					if(nextindex > N) nextindex = N - (nextindex - N);
					int nextturn = turn + 1;
					
					if (Lose[index] == 1)
					{
						nextturn++;
						if(nextturn > T) break;
					}
					
					if (Back[nextindex] == 1)
					{
						dp[nextturn][0] += dp[turn][index] / 6;
					}
					else
					{
						dp[nextturn][nextindex] += dp[turn][index] / 6;
					}
    			}
    	
    	double ans = 0;
    	for (int turn = 1; turn <= T; turn++) 
    	{
			ans += dp[turn][N];
			//System.out.println(turn + ":" + dp[turn][N]);
		}
    	//System.out.println("------------------------------------------");
    	System.out.printf("%.06f\n", ans);
    	//System.out.println("------------------------------------------");
    	
    	/*System.out.println("-- DP ----------------------------------------");
    	for (int turn = 0; turn <= T; turn++) 
    		for(int index = 0; index <= N;index++)
    			System.out.println(dp[turn][index]);
    	System.out.println("----------------------------------------------");*/
    }
     
    public static void main(String[] args)
    {
        Scanner sca = new Scanner(System.in);
        
        while(true)
        {
        	N = sca.nextInt();
        	T = sca.nextInt();
        	L = sca.nextInt();
        	B = sca.nextInt();
        	if(N == 0) break;
        	
        	Lose = new int[N+1];
        	for (int i = 0; i < N+1; i++) Lose[i] = 0;
        	for (int i = 0; i < L; i++) Lose[sca.nextInt()] = 1;
        	
        	Back = new int[N+1];
        	
        	for (int i = 0; i < N+1; i++) Back[i] = 0;
        	for (int i = 0; i < B; i++) Back[sca.nextInt()] = 1;
            
            start();
        }
        
    }
}