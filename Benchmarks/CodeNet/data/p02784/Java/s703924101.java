import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int n = sc.nextInt();
    int sumAtk = 0;
    for (int i = 0; i < n; i++) {
      sumAtk += sc.nextInt();
    }
    System.out.println(sumAtk >= h ? "Yes" : "No");
  }
}
