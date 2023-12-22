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
  
  while(true)
  {
      a=a-d;
      if(a==0)
      {
       
       break;
      }
      
      c=c-b;
      if(c==0)
      {
       
       break;
      }
  }
  if(a==0)
  System.out.println("No");
  else
  System.out.println("Yes");
}
}