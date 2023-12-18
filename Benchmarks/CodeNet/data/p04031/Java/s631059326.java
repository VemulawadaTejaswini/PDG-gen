import java.util.*;
import java.io.*;


public class Main{

     public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       int [] arr = new int[n];
       
     
       
       for(int i=0;i<n;i++)
       arr[i] = scanner.nextInt();
      
        int d =(int) Math.ceil(((arr[0]+arr[n-1])/2));
          
        
        int sum=0;
        for(int i=0;i<n;i++)
         sum = sum+(int) Math.pow((arr[i]-d),2);
    
        System.out.println(sum);
        
        
        //System.out.println()
        //for(int i=0;i<n;i++)
     }
}