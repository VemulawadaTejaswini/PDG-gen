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
        
        
        int[] a = java.util.stream.IntStream.rangeClosed(1110, 1119).toArray();
       a = java.util.stream.IntStream.rangeClosed(2220, 2229).toArray();
        a = java.util.stream.IntStream.rangeClosed(3330, 3339).toArray();
         a = java.util.stream.IntStream.rangeClosed(4440, 4449).toArray();
          a = java.util.stream.IntStream.rangeClosed(5550, 5559).toArray();
           a = java.util.stream.IntStream.rangeClosed(6660, 6669).toArray();
            a = java.util.stream.IntStream.rangeClosed(7770, 7779).toArray();
             a = java.util.stream.IntStream.rangeClosed(8880, 8889).toArray();
              a = java.util.stream.IntStream.rangeClosed(9990, 9999).toArray();
              
              for(i = 0; i < a.length ; i++){
                  if(num == a[i]){
                      System.out.println("YES");
                      
                  }else{
                      System.out.println("NO");
                  }
              }
	}
}
