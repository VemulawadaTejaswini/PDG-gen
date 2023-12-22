import java.util.*;
import java.io.*;


public class Main{

     public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        long []arr= new long[d];
        
         for(int i=0;i<d;i++)
         arr[i]= (long)scanner.nextInt();
         
        long sum=0;
        
        for(int i=0;i<d;i++)
        {
          for(int j=i+1;j<d;j++) 
          {
            sum= sum+ arr[i]*arr[j];
            
          }
            
        }
        long n = (long)Math.pow(10,9)+7;
        System.out.println(sum%n);
        
     }
}
