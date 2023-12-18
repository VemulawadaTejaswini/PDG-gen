import java.util.*;
public class Main
{
  public static void main(String args[])
  {
      Scanner sc = new Scanner(System.in);
      char c = sc.next().charAt(0);
      int x = (int)(c);
      System.out.println((char)(x+1));
  }
}