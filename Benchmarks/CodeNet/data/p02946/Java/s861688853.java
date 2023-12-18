import java.util.*;
public class Main{
public static void main(String args[])
{
  Scanner sp=new Scanner(System.in);
   int k=sp.nextInt();
    int x=sp.nextInt();
    int n=k+x;
    int c=x-k;
    for(int i=x;i>c;i--)
      {
   
       System.out.print(i);
      }
 
   for(int i=x+1;i<n;i++)
   {
   
       System.out.print(i);
   }
      
   }


} 
   


