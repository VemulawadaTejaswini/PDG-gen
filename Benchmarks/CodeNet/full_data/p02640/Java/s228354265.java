import java.util.*;

public class Main{
public static void main(String[] args)
{ 
  Scanner sc=new Scanner(System.in);
  int x=sc.nextInt();
  int y=sc.nextInt();
  boolean flag=solve(x,y);
  System.out.println(flag?"Yes":"No");
}
  static boolean solve(int x,int y)
  {  if(y>x*4) return false;
   
   if(2*x==y || 4*x==y)
      return true;
   
   if(y%2==0 || y%4==0 || y%6==0)
     return true;
   
   return false;
   
  }
}