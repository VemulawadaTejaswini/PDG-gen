import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int h = s.nextInt();
    int w = s.nextInt();
    System.out.println((n-h+1)*(n-w+1));
  }
}