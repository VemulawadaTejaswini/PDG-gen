import java.util.*;
import java.io.*;

public class Main{

     public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
         int b= scanner.nextInt();
          int c= scanner.nextInt();
           int d= scanner.nextInt();
         int sum=0;
         for(int i=0;i<a;i++)
         {
             if(i<b)
             sum=sum+c;
             else
             sum=sum+d;
             
         }
         
         System.out.println(sum);
         
        
        
        
        
        //for(int i=0;i<n;i++)
        
        //System.out.println();
     }
}