import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    long k = sc.nextLong();

    long[] nBooks = new long[n];
    long[] mBooks = new long[m];
    for (int i = 0; i < n; i++) {
      nBooks[i] = sc.nextLong();
    }
    for (int i = 0; i < m; i++) {
      mBooks[i] = sc.nextLong();
    }

    long ret = 0;
    int nCounter = 0;
    int mCounter = 0;
    long currentMinutes = 0;
    for (int i = 0; i < n + m; i++) {
      if (nCounter < n && mCounter < m) {
        if (((nBooks[nCounter] <= mBooks[mCounter]) && (nBooks[nCounter] + currentMinutes <= k))) {
          currentMinutes += nBooks[nCounter];
          nCounter++;
          ret++;
        } else {
          if (((mBooks[mCounter] <= nBooks[nCounter]) && (mBooks[mCounter] + currentMinutes <= k))) {
            currentMinutes += mBooks[mCounter];
            mCounter++;
            ret++;
          }
        }
      } else if (mCounter < m) {
        currentMinutes += mBooks[mCounter];
        mCounter++;
        ret++;
      } else {
        currentMinutes += nBooks[nCounter];
        nCounter++;
        ret++;
      }
    }
    System.out.println(ret);
  }
}