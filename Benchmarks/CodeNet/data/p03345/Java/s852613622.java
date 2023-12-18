import java.io.*;
import java.util.*;

public class Main {
    public static long parseLong (String[] args) {
    Scanner sc = new Scanner(System.in);
    long A,B = 0,C = 0,K = Integer.parseLong(sc.next());
                   
       for(long i = 1; i<K; i++);
       A = B + C;
       B = C + A;
       C = A + B;
       if(A > 1000000000000000000);{
   	System.out.println("Unfair"); 
       }
       if(A < 1000000000000000000);
       {
    	   System.out.println(A - B);
       }        
                
                };
         
        
    }

