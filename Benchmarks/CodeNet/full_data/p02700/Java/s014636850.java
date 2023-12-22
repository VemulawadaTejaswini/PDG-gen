import  java.util.*;
public class Main
{
  public static void main(String[] args)
{  Scanner sc=new Scanner(System.in);
  //int s,w;
  
  int a=sc.nextInt();
  int b=sc.nextInt();
  int c=sc.nextInt();
  int d=sc.nextInt();
  int flag=0;
  while(true)
  {
      a=a-d;
      if(a==0)
      {
       flag=1;
       break;
      }
      
      c=c-b;
      if(c==0)
      {
       flag=2;
       break;
      }
  }
  if(flag==1)
  System.out.println("No");
  else
  System.out.println("Yes");
}
}