import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
  private static Scanner sc;

  public static void main(String[] args) {
    sc = new Scanner(System.in);
    new Main().solve();
  }


  private void solve() {
    int D = sc.nextInt();
    int G = sc.nextInt();
    Point[] ord = new Point[D];
    Point[] prenum = new Point[D];
    for (int i = 0; i < D; i++) {
      Point p = new Point(i + 1, sc.nextInt(), sc.nextInt());
      ord[i] = p;
      prenum[i] = p;
    }
    Arrays.sort(prenum, new MyComp2());

    long tmp = 0;
    int times = 0;
    int total = 0;
    int ordIdx = D - 1;
    int preNumIdx = 0;
    while (tmp < G) {
      int ordCnt = 0;
      int preNumCnt = 0;
      long ordTmp = 0;
      long preNumTmp = 0;
      // ord
      Point nowOrd = ord[ordIdx];

      for (int i = 0; i < nowOrd.num; i++) {
        if (ordTmp >= G - tmp) {
          break;
        }

        ordTmp += nowOrd.idx * 100;
        if (i == nowOrd.num - 1) {
          ordTmp += nowOrd.comp;
        }
        ordCnt++;
      }

      // prenum
      Point nowPre = prenum[preNumIdx];

      for (int i = 0; i < nowPre.num; i++) {
        if (preNumTmp >= G - tmp) {
          break;
        }

        preNumTmp += nowPre.idx * 100;
        if (i == nowPre.num - 1) {
          preNumTmp += nowPre.comp;
        }
        preNumCnt++;
      }
      if (ordTmp >= G && preNumTmp >= G) {
        if (ordCnt < preNumCnt) {
          total += ordCnt;
          tmp += ordTmp;
          ordIdx--;
          continue;
        } else if (ordCnt > preNumCnt) {
          total += preNumCnt;
          tmp += preNumTmp;
          preNumIdx++;
          continue;
        } else if (ordTmp >= G) {
          total += ordCnt;
          tmp += ordTmp;
          ordIdx--;
          continue;
        } else if (preNumTmp >= G) {
          total += preNumCnt;
          tmp += preNumTmp;
          preNumIdx++;
          continue;
        }
      }

      if (ordTmp > preNumTmp) {
        total += ordCnt;
        tmp += ordTmp;
        ordIdx--;
        continue;
      } else if (ordTmp < preNumTmp) {
        total += preNumCnt;
        tmp += preNumTmp;
        preNumIdx++;
        continue;
      }

      if (ordCnt < preNumCnt) {
        total += ordCnt;
        tmp += ordTmp;
        ordIdx--;
      } else if (ordCnt > preNumCnt) {
        total += preNumCnt;
        tmp += preNumTmp;
        preNumIdx++;
      } else {
        if (ordTmp > preNumTmp) {
          total += preNumCnt;
          tmp += preNumTmp;
          preNumIdx++;
        } else {
          total += ordCnt;
          tmp += ordTmp;
          ordIdx--;
        }
      }
    }
    System.out.println(total);
  }
}

class Point {
  int idx;
  int num;
  int comp;

  public Point(int idx, int num, int comp) {
    this.idx = idx;
    this.num = num;
    this.comp = comp;
  }
}

class MyComp2 implements Comparator<Point> {
  public int compare(Point c1, Point c2) {
    if (c1.num > c2.num) {
      return 1;
    } else if (c1.num < c2.num) {
      return -1;
    } else {
      return 0;
    }
  }
}
