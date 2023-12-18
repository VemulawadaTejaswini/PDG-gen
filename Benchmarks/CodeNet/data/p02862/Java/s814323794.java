import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    sc.close();
    if ((X+Y)%3 != 0) {
      System.out.println(0);
      return;
    }
    int a = X - (X+Y)/3, b = Y - (X+Y)/3;
    long out = 1;
    long modv = 1000000007;
    for (int i = a+1; i <= a+b; i++) {
      out *= i;
      out /= (i-a);
      out = out% modv;
    }
    System.out.println(out);
  }
}
