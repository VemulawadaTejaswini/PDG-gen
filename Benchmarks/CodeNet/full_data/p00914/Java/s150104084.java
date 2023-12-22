import java.awt.Point;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
     
    static int n, k, s;
    
    static int count;
    static int[] shugo;
    
    static void dfs(int index)
    {
    	if(index == k)
    	{
    		int sum = 0;
    		for (int i = 0; i < shugo.length; i++) sum += shugo[i];
    		if(sum == s) count++;
    		return;
    	}
    	
    	int prenum = 0;
    	if(index != 0) prenum = shugo[index - 1];
    	for (int i = prenum+1; i <= n; i++) {
			shugo[index] = i;
			dfs(index + 1);
		}
    	
    }
    
    static void start()
    {
    	count = 0;
    	shugo = new int[k];
    	
    	dfs(0);
    	
    	System.out.println(count);
    }
     
    public static void main(String[] args)
    {
        Scanner sca = new Scanner(System.in);
        
        
        
        while(true)
        {
        	n = sca.nextInt();
        	k = sca.nextInt();
        	s = sca.nextInt();
        	
        	if(n == 0) break;
            
            start();
        }
        
    }
}