import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    int num = 0;
    int max = num;
    for (int i = 0; i < N; i++) {
      if (S.charAt(i) == 'I') {
        num++;
      } else {
        num--;
      }
      if (max < num) {
        max = num;
      }
    }
    System.out.println(max);
  }
}