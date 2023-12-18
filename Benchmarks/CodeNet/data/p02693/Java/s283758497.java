import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a= sc.nextInt();
    int b= sc.nextInt();
    int c=0;
    for(int i=a;i<=b;i++)
    {
      if(i%a==0)
      {System.out.println("OK");
       break;}
      else c++;
    }
    if(c==(b-a))
      System.out.println("NG");
  }
}

        