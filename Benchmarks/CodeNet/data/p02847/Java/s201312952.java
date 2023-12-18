import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long X = sc.nextLong();
    
    if (A + B > X) {
      System.out.println(0);
    }
    for (int i = 0; i < 10000000000; i++) {
      int j = String.valueOf(i).length();    // 3が返される
      if (A * i + B * j > x) {
        i--;
        System.out.print(i);
        break;
      }
    }
  }
}