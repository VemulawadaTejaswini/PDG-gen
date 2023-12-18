import java.util.Scanner;
public class Main
{
  public static void main(String args[])
  {
    int a,b;
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    b = sc.nextInt();
    if(a>(2*b))
      System.out.print(a-2*b);
    else
      System.out.print("0");
  }
}