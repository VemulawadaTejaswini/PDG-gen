import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();
    
    int r = A - B;
    int r1 = C - D;
    
    if(r <= 0)
      System.out.println("No");
    else
      System.out.println("Yes");
    if(r1 <= 0)
      System.out.println("No");
    else
      System.out.println("Yes");
  }
}
