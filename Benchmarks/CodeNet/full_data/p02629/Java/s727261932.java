import java.util.*;
public class Main
{
 public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();
    long begin[]=new long[10];
    long end[]=new long[10];
    begin[0]=1;
    end[0]=26;
    for(int i=1;i<10;i++)
    {
      begin[i]=end[i-1];
      int p=2;
      end[i]=(long)(Math.pow(26,p));
      for(int k=1;k<p;k++)
        end[i]-=(long)(Math.pow(26,k));
      p++;
    }
   String s="";
   for(int i=0;i<10;i++)
   {
     if(n>=begin[i]&&n<=end[i])
     {
       while(n!=0)
       {
         int r=(int)(n%begin[i]);
         s+=(char)(96+r);
         n/=begin[i];
       }
       System.out.println(s);break;
     }
   }
  }
}