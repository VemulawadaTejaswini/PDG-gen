import java.util.Scanner;

public class Main{
  public void keisan(int n,int a) {
    boolean k = false;
    
    for (int i = 0; i < 100; i ++) {
      for ( int j = 0; j <= a; j++) {
        int r = j + i *500;
        if (n == r) {
          k = true;
          break;
        }
      }
    }
    if (k) System.out.println("Yes");
    else System.out.println("No");
  }

  public static void main (String args[]) {
    Scanner scan = new Scanner(System.in);

    String N = scan.next();
    String A = scan.next();

    int n = Integer.parseInt(N);
    int a = Integer.parseInt(A);

    Main main = new Main();
    
    main.keisan(n,a);
  }
}