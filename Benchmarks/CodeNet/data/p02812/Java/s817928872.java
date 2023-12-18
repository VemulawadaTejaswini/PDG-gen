import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    int count = 0;
    char[] c = new char[N];

    for (int i = 0 ; i < S.length() ; i++ ) {
      c[i] = S.charAt(i);
    }

    for (int i = 0 ; i < N-2 ; i++ ) {
      if (c[i] == 'A') {
        if (c[i+1] == 'B') {
          if (c[i+2] == 'C') {
            count++;
          }
        }
      }
    }
    System.out.println(count);
  }
}
