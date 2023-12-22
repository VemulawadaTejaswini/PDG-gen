import java.awt.Point;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
     
	static int p, q, a, n;
	
    static int count;
    
    static void dfs(int bunshi, int bunbo, int startnum, int index)
    {
    	if(index == n) return;
    	
    	for (int i = startnum; i <= 12000; i++) {
    		if(bunbo * i > a) return;
    		
			int left = p * bunbo * i;
			int right = q * bunshi * i + q * bunbo;
			
			if(left == right)
			{
				count++;
				continue;
			}
			if(left < right) continue;
			
			dfs(bunshi * i + bunbo, bunbo * i, i, index + 1);
		}
    }
    
    static void start()
    {
    	count = 0;
    	
    	dfs(0, 1, 1, 0);
    	
    	System.out.println(count);
    }
     
    public static void main(String[] args)
    {
        Scanner sca = new Scanner(System.in);
        
        while(true)
        {
        	p = sca.nextInt();
        	q = sca.nextInt();
        	a = sca.nextInt();
        	n = sca.nextInt();
        	
        	if(n == 0) break;
            
            start();
        }
        
    }
}