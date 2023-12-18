import java.util.*;

public class Main {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    int N = sc.nextInt();
    int M = sc.nextInt();
    String S = sc.next();
    String T = sc.next();

    int L = 1;
    for (int i=1; i<=N*M; i++) {
      if (i % N == 0 && i % M == 0) {
        L = i;
        break;
      }
    }

    char[] ch = new char[L];

    int interval = L / N;
    for (int i=0; i<N; i++) {
      ch[i*interval] = S.charAt(i);
    }

    interval = L / M;
    for (int i=0; i<M; i++) {
      if (ch[i*interval] != '\u0000' && ch[i*interval] != T.charAt(i)) {
        System.out.println(-1);
        return;
      }
    }

    System.out.println(L);

  }
}