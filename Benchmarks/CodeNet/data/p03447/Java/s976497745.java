import java.util.*;

public class Buying_sweets{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();

    X -= A;
    X = X % B;
    System.out.println(X);
  }
}
