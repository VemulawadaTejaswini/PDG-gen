import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextint();
    int y  = sc.nextInt();
    int z  = sc.nextInt(); 
    int result = y % 10;
    int result1 = z % 10;
    if(x == result)
      System.out.println("OK");
    else
       System.out.println("NG");
    if(x == result1)
      System.out.println("OK");
    else
       System.out.println("NG");
    
    
  }
}
