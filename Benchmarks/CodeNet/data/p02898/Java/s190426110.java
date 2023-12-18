import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


    
    public class Main{
        public static int function(int[] Arr,int K)
        {
            int N=Arr.length;
            int count=0;
            for(int i=0;i<N;i++)
            {
                if(Arr[i]>=K)
                    count++;
            }
            return count;
        }
        

   public static void main (String[] args)  throws IOException{

      Scanner sc=new Scanner(System.in);
      int N=0;
      int K=0;
      if(sc.hasNextInt())
      {
          N=sc.nextInt();
          K=sc.nextInt();
      }
      
          int[] Arr=new int[N];
          for(int i=0;i<N;i++)
          {
              Arr[i]=sc.nextInt();
          }
          
      
      System.out.println(function(Arr,K));
     
      
   
   }
   
}
   