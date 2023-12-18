import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();

      
      System.out.println(comb(n) + comb(m));
  }

  private static long comb(int a) {
    return a * (a-1) / 2;
  }
}