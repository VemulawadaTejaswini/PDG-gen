import java.util.*;
import java.io.*;


public class Main{

     public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int n1= scanner.nextInt();
        int n2= scanner.nextInt();
        int n3= scanner.nextInt();
        int n4= scanner.nextInt();
        
        int arr[] = new int[4];
        
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