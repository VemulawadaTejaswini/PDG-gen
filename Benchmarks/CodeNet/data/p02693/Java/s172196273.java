import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y  = sc.nextInt();
    int z  = sc.nextInt(); 
    boolean b = true;
    for(int i = y; i <= z; i++)
    {
      if(i % x == 0)
        b = false;
    }
    if(b == false)
      System.out.println("OK");
    else
      System.out.println("NG");
  }
}
