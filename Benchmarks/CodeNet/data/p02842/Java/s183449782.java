import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    double b = (a+1)/1.08;
    int c = (int)b;

    System.out.println(c);
  }
}