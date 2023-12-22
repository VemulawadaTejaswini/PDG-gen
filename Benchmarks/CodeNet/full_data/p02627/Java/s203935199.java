import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    char c = sc.next();
    if(char c >= 'A' && c<='Z')
      System.out.print("A");
    if(char c>='a' && c<='z')
      System.out.print("a");
  }
}