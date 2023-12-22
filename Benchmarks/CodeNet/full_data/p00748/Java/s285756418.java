import java.awt.Point;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import javax.naming.InitialContext;
 
public class Main {
     
	static int N;
	static int dp1[];
	static int dp2[];
	
	static void init()
	{
		dp1 = new int[1000001];
		dp1[0] = 0;
		dp1[1] = 1;
		for(int i = 2;i <= 1000000;i++)
		{
			dp1[i] = Integer.MAX_VALUE;
			for (int j = 1; j < 200; j++) {
				int d = j*(j+1)*(j+2)/6;
				if(i - d < 0)
				{
					break;
				}
				else if(i - d == 0)
				{
					dp1[i] = 1;
					break;
				}
				dp1[i] = Math.min(dp1[i], dp1[i-d]+1);
			}
		}
		
		dp2 = new int[1000001];
		dp2[0] = 0;
		dp2[1] = 1;
		for(int i = 2;i <= 1000000;i++)
		{
			dp2[i] = Integer.MAX_VALUE;
			for (int j = 1; j < 200; j++) {
				int d = j*(j+1)*(j+2)/6;
				if(d % 2 == 0) continue;
				if(i - d < 0)
				{
					break;
				}
				else if(i - d == 0)
				{
					dp2[i] = 1;
					break;
				}
				dp2[i] = Math.min(dp2[i], dp2[i-d]+1);
			}
		}
	}
	
    
    static void start()
    {
    	System.out.printf("%d %d\n", dp1[N], dp2[N]);
    }
     
    public static void main(String[] args)
    {
        Scanner sca = new Scanner(System.in);
        
        init();
        
        while(true)
        {
        	N = sca.nextInt();
        	
        	if(N == 0) break;
            
            start();
        }
        
    }
}