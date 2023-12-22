import java.util.*;
class Main
{
  public static void main(String args[])
  {
  Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    if(n%1000!=0)
    	System.out.println(1000-(n%1000));
    else
      System.out.println("0");
  }
}