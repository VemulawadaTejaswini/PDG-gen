import java.util.Scanner;
 
class Main
{
  public static void main(String args[])
  {
    Scanner scanner = new Scanner(System.in);
    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int C = scanner.nextInt();
    if(A==7)
    {
      if(B==5&&C==5)
      {
        System.out.println("YES");
      }
    }
    if(B==7)
    {
      if(A==5&&C==5)
      {
        System.out.println("YES");
      }
    }
    if(C==7)
    {
      if(A==5&&B==5)
      {
        System.out.println("YES");
      }
    }
    else
    {
      System.out.println("NO");
    }
  }
}