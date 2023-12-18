import java.util.*;
import java.io.*;

public class Main{

     public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
         long n = (long) scanner.nextInt();
         long w = (long) scanner.nextInt(); 
         long t = (long) scanner.nextInt();
            
        long sum=0;
        
        long prev =scanner.nextInt();
        
        for(int i=1;i<n;i++)
        {
            long temp = (long) scanner.nextInt();
            sum = sum + Math.min(w*(temp - prev),t);
            prev = temp;
        }
         
         
         System.out.println(sum);
       
}
}