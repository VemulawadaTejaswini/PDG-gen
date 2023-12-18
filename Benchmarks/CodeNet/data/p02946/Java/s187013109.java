import java.util.*;
public class Main{
public static void main(String args[])
{
  Scanner sp=new Scanner(System.in);
   int k=sp.nextInt();
    int x=sp.nextInt();
    int n=k+x;
    int c=x-k;
   
 
   for(int i=c+1;i<n;i++)
   {
      if(i<1000000 && i>-1000000)
      {
                 System.out.print(i+" ");
      }
       
   }
      
   }
 
 
} 
   