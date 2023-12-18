import java.uti.*;

class Main
{
  public static void main(String[] args)
  {
    Scnner sc = new Scanner(System.in);
    
    int fiveCoins = sc.nextInt();
    int n = sc.nextInt();
    
    if (500 * fiveCoins >= n) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}