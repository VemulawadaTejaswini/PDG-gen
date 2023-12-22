import java.awt.Point;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
     
    static int n;
	
    private static int[] primetable(int max)
    {
    	int[] ret = new int[max + 1];
    	int loop;
    	
    	for (int i = 0; i < max + 1; i++) ret[i] = 1;
    	ret[0] = ret[1] = 0;
    	loop = (int)(Math.sqrt(max) + 1);
    	
    	for (int i = 2; i <= loop; i++) {
			if (ret[i] == 0) {
				continue;
			}
			for (int j = i*2; j < max+1; j+=i) {
				ret[j] = 0;
			}
		}
    	return ret;
    }
    
    static void start()
    {
    	int[] prime = primetable(246912);
    	
    	int count = 0;
    	for (int i = n+1; i <= 2*n; i++) {
			if(prime[i] == 1) count++;
		}
    	
    	System.out.println(count);
    }
     
    public static void main(String[] args)
    {
         
        Scanner sca = new Scanner(System.in);
        
        while(true)
        {
        	n = sca.nextInt();
        	if(n == 0) break;
            
            start();
        }
        
    }
}