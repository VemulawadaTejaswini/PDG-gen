import java.io.*;
import java.util.*;
class Main
{
 public static void main(String[] args)throws IOException
 {
  InputStreamReader read=new InputStreamReader(System.in);
  BufferedReader in=new BufferedReader(read);
  Scanner sc=new Scanner(System.in);
  int x,q,f,r;
  r=0;
  String s,p;
  String[] xi=sc.nextLine().split(" ");
  s=xi[0];
  xi=sc.nextLine().split(" ");
  q=Integer.parseInt(xi[0]);
  while(q>0)
  {
   xi=sc.nextLine().split(" ");
   x=Integer.parseInt(xi[0]);
   if(x==1)
   r=(r+1)%2;
   else
   {
    f=Integer.parseInt(xi[1]);
    p=xi[2];
    if(r==1)
    {
     if(f==1)
     f=2;
     else
     f=1;
    }
    if(f==1)
    s=p+s;
    else
    s+=p;
   }
   q--;
  }
  if(r==1)
  {
   p="";
   for(int i=0;i<s.length();i++)
   p=s.charAt(i)+p;
   s=p;
  }
  System.out.println(s);
 }
}