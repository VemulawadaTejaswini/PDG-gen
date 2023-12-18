import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    String str1 = sc.next();
    boolean b = false;
    for(char c = 'a'; c <= 'z'; c++)
    {
      if((str+c).equals(str1))
      {
        b = true;
      }
    }
    System.out.println(b?"Yes":"No");
  }
}
