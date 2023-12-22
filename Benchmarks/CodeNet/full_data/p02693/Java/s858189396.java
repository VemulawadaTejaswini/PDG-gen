import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a= sc.nextInt();
    int b= sc.nextInt();
    boolean c = true;
    for(int i=a;i<=b;i++)
    {
      if(i%n==0)
      {System.out.println("OK");
     return;}

    }
    System.out.println("NG");
 
  }
}

        