import java.util.*;

public class Main {
  public static void main(String[] args) {
    long start = System.currentTimeMillis();
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    if(a > b) {
      System.out.println(a - 1);
    } else {
      System.out.println(a);
    }
    long end = System.currentTimeMillis();
    System.out.println((end - start)  + "ms");
  }
}