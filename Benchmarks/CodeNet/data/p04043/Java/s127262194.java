import java.io.*;
import java.util.*;
class main
{
public static void main (String args[])
{
   Scanner sc=new Scanner(System.in);
   int a[]=new int[3];
    a[0]=5;
    a[1]=7;
     a[2]=5;
    int b[]=new int[3];
    for(int i=0;i<3;i++)
      {b[i]=sc.nextInt();}
     int count=0;
    for(int i=0;i<3;i++)
     {
       for(int j=0;j<3;j++)
        {
          if(b[i]==a[j])
          {
             a[j]=0;
             count++;
              break;
           }
         }
       }
  if(count=3)
{
  System.out.println("YES");
}
else
System.out.println("NO");
   

}
}