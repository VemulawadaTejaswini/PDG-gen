import java.util.*;
import java.io.*;
public class Main{

     public static void main(String []args) throws IOException{
       
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       int n = Integer.parseInt(br.readLine());
       
       String a[] = br.readLine().split(" ");
       
       int array[] = new int[n];
       int i=0;
       for(String x: a) array[i++] = Integer.parseInt(x);
       
       int count= 0;
       for( i=0;i<n;i++) {
           for(int j=i+1;j<n;j++) {
           
               if(Math.abs(i-j)==array[i]+array[j])
               {
                  
                   count++;
                   
               }
           }
       }
       
       System.out.println(count);
       
     }
}