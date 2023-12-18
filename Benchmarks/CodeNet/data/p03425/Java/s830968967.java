import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int m = 0;
    int a = 0;
    int r = 0;
    int c = 0;
    int h = 0;
    int P[] = { 0, 0, 0, 0, 0, 0, 1, 1, 1, 2 };
    int Q[] = { 1, 1, 1, 2, 2, 3, 2, 2, 3, 3 };
    int R[] = { 2, 3, 4, 3, 4, 4, 3, 4, 4, 4 };
    char S[] = new char[N];
    for (int i = 0; i < N; i++) {
      S[i] = sc.next().charAt(0);
      if (S[i] == 'M')
        m++;
      if (S[i] == 'A')
        a++;
      if (S[i] == 'R')
        r++;
      if (S[i] == 'C')
        c++;
      if (S[i] == 'H')
        h++;
    }
    int D[] = new int[5];
    D[0] = m;
    D[1] = a;
    D[2] = r;
    D[3] = c;
    D[4] = h;
    int res = 0;
    for (int d = 0; d < 10; d++)
      res += D[P[d]] * D[Q[d]] * D[R[d]];
    System.out.println(res);
  }
}