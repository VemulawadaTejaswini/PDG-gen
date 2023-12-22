import java.awt.Point;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
     
    static int num;
    static ArrayList<Integer> getsudo;
    static int[] ret;
    
    static void start()
    {
    	// 月土素因数探し
    	System.out.print(num + ":");
    	for (int i = 6; i <= num; i++) {
    		if( (i % 7) != 1 && (i % 7) != 6 ) continue;
    		if(ret[i] == 0) continue;
    		if(num % i == 0) System.out.print(" " + i);
		}
    	System.out.print("\n");
    }
     
    public static void main(String[] args)
    {
        Scanner sca = new Scanner(System.in);
        
        // 月土数作り
    	getsudo = new ArrayList<Integer>();
    	for (int i = 1; i <= 300000; i++) {
    		if( (i % 7) == 1 || (i % 7) == 6 ) getsudo.add(new Integer(i));
    	}
    	
    	// 月土素数作り
    	ret = new int[300000+1];
    	for (int i = 0; i < (300000+1); i++) ret[i] = 1;
    	ret[0] = ret[1] = 0;
    	int loop = (int)(Math.sqrt(300000) + 1);
    	for (int i = 2; i <= loop; i++) {
    		if( (i % 7) != 1 && (i % 7) != 6 ) continue;
    		if(ret[i] == 0) continue;
    		for (Integer j : getsudo) {
    			if(j == 1) continue;
    			if(300000 < i*j) break;
    			ret[i*j] = 0;
    		}
    	}
        
        while(true)
        {
        	num = sca.nextInt();
        	if(num == 1) break;
            
            start();
        }
        
    }
}