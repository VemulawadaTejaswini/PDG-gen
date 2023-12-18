/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();	//・・・①
        
        int a[];
        a = new int[90];
        
        int t = 1110;
            for(int g = 0; g < 91 ; g++){              
              for(int i = 0; i < 10 ; i++){
                  a[g]=1110+i;
                  
                  
              }
             t = t + 1110;
            }
            for(int h = 0; h < 91; h++){
            if(num == a[h]){
                      System.out.println("YES");
                      
                  }else{
                      System.out.println("NO");
                  }
            }
	}
	}
}
