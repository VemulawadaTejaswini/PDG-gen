import java.io.*;
import java.lang.reflect.Array;
import java.nio.channels.ScatteringByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
 
public class Main {
    public static void main (String[] args) throws IOException
    {
    	  Scanner sc = new Scanner(System.in);
    	  int N = sc.nextInt();
    	  int T = sc.nextInt();
    	  int t[] = new int [220000003];
    	  int c[] = new int [220000003];
    	  int d[] = new int [220000003];
    	  long ans = 1;
    	  
    	  for (int i = 0 ; i<=N+4 ; i++){
    		 c[i] = 0;
    	  }
    	  
    	  for (int i = 1 ; i<=N ; i++){
    		  t[i] = sc.nextInt();
    		  c[t[i]] = c[t[i]] + 1;
    		  c[t[i] + T] = c[t[i] + T] - 1;
    	  }
    	  
    	  d[0] = 1;
    	  for (int i = 1 ; i<= 220000003 ; i++){
    		  d[i] = d[i-1] + c[i];
    		  if (d[i] > 0) {
    			  ans = ans + 1;
    		  }
    		  
    	  }
    	  
    	  System.out.println(ans);
    }
    
}
    