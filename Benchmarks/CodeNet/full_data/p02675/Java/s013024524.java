import java.util.*;

class Main
{
  public static void main(String [] args)
  {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    if(n%1 == 2 || n%1 = 4 || n%1 = 5 || n%1 == 7 || n%1 == 9)
      System.out.println("hon");
    if(n%1 == 0 || n%1 = 1 || n%1 = 6 || n%1 == 8)
      System.out.println("pon");
    if(n%1 == 3)
      System.out.println("bon");
  }
}