import java.io.*;
import java.util.*;
class Main 
{
 public static void main(String args[]) throws IOException
 {
   int n;
   long p=1;
   Scanner sc=new Scanner(System.in);
   n=sc.nextInt();
   int a[]=new int[n];
   for(int i=0;i<n;i++)
   	a[i]=sc.nextInt();
   for(int i=0;i<n;i++)
   {
     p=p*(long)a[i];
   }
   if(p<=(long)Math.pow(10,18))
   	System.out.println(p);
   else
     System.out.println(-1);
 
 }
}