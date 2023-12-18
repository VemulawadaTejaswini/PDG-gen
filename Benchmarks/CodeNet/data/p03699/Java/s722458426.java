import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    Integer[] s = new Integer[N];

    int max = 0;

    for (int i = 0; i < N; i++) {
      s[i] = sc.nextInt();
      max += s[i];
    }

    sc.close();

    Arrays.sort(s);
    
    if (max % 10 != 0) {
      System.out.println(max);
    } else {
      for (int i = 0; i < N; i++) {
        max -= s[i];
        if (max % 10 != 0) {
          System.out.println(max);
          break;
        } else {
          if (i == N - 1) {
            System.out.println(0);
          }
        }
      }
    }

  }

}