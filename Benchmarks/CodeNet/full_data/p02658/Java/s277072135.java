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
   long a[]=new long[n];
   for(int i=0;i<n;i++)
    a[i]=sc.nextLong();
   for(int i=0;i<n;i++)
   {
     p=p*a[i];
   }
   if(p>=0&&p<=(long)Math.pow(10,18))
    System.out.println(p);
   else
     System.out.println(-1);
 
 }
}