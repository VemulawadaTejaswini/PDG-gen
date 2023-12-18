import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    int x =0;
    int max =0;
    for (int i=0; i<N; i++) {
      if (S.charAt(i) == 'D') {
        x--;
      }
      if (S.charAt(i) == 'I') {
        x++;
        if (x > max) max = x;
      }
    }
    System.out.println(max);
  }
}