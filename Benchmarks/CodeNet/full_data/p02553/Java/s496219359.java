import java.util.*;
import java.io.*;


public class Main{

     public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        long n1= scanner.nextInt();
        long n2= scanner.nextInt();
        long n3= scanner.nextInt();
        long n4= scanner.nextInt();
        
        long arr[] = new long[4];
        
        arr[0] = n1*n3;
         arr[1] = n1*n4;
          arr[2] = n2*n3;
           arr[3] = n2*n3;
           
           
        Arrays.sort(arr);
    
         System.out.println(arr[arr.length-1]);
        
        
        
        //for(int i=0;i<n;i++)
        //int n= scanner.nextInt();
        //System.out.println()
     }
}