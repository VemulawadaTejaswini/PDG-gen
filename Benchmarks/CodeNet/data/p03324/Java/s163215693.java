import java.util.*;
 
public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int d  = sc.nextInt();
    int n = sc.nextInt();
    if(d == 0) {
      System.out.println(n);
      return;
    }
    int zyou = 1;
    for (int i = 0; i < d; i++) {
        zyou *= 100;
    }
    System.out.println(zyou * n);
  }
}