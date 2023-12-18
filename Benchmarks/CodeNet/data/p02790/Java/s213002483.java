import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int n = a < b ? a : b;
    int m = a > b ? a : b;
    for (int i = 0; i < m; i++) {
      System.out.print(n);
    }
    System.out.println();
  }
}