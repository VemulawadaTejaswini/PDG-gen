import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    int count = 0;
 
    if (a % 2 != 0) {
      count++;
    }
    if (b % 2 != 0) {
      count++;
    }
    if (count == 2) {
      System.out.println("Yes");
      return;
    }
    
    System.out.println("No");
  }
}