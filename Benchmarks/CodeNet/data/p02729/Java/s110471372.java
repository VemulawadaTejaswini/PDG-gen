import java.util.*;

public class Main{

  static int factorial(int n) {
    if (n == 0) {
      return 1;
    }
    return n * factorial(n - 1);
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());

    if((n == 1 && m == 1)||(n == 0 && m == 0))  System.out.println(0);
    else if(n == 1 || n == 0) System.out.println(m * (m - 1) / 2);
    else if(m == 1 || m == 0) System.out.println(n * (n - 1) / 2);
    else 
      System.out.println(m*(m-1)/2 + n*(n-1)/2);
  }
}
