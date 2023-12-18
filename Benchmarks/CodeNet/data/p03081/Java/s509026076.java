import java.util.Scanner;

class Main {

  public enum Status {
    LEFT, RIGHT, OK;
  }

  public static Status LeftRightOk(String s, String[] t, String[] d, int index) {
    char currchar = s.charAt(index);
    for (int i = 0; i < t.length; i++) {
      if (currchar == t[i].charAt(0)) {
        if (d[i].equals("R")) {
          if (index != s.length() - 1) {
            currchar = s.charAt(++index);
          } else {
            return Status.RIGHT;
          }
        } else {
          if (index != 0) {
            currchar = s.charAt(--index);
          } else {
            return Status.LEFT;
          }
        }
      }
    }
    return Status.OK;
  }

  public static int searchLeftOkIdx(String s, String[] t, String[] d) {
    int ok = s.length() - 1;
    int left = 0;
    int mid = (ok + left) / 2;
    while (ok - left > 1) {
      if (LeftRightOk(s, t, d, mid) == Status.LEFT) {
        left = mid;
      } else {
        ok = mid;
      }
      mid = (ok + left) / 2;
    }
    return ok;
  }

  public static int searchRightOkIdx(String s, String[] t, String[] d) {
    int ok = 0;
    int right = s.length() - 1;
    int mid = (ok + right) / 2;
    while (right - ok > 1) {
      if (LeftRightOk(s, t, d, mid) == Status.RIGHT) {
        right = mid;
      } else {
        ok = mid;
      }
      mid = (ok + right) / 2;
    }
    return ok;
  }

  public static void main(String[] args) {
    {
      {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        int Q = Integer.parseInt(scanner.next());
        String s = scanner.next();
        String[] t = new String[Q];
        String[] d = new String[Q];
        for (int i = 0; i < Q; i++) {
          t[i] = scanner.next();
          d[i] = scanner.next();
        }
        scanner.close();
        int leftiOkdx = searchLeftOkIdx(s, t, d);
        int rightOkidx = searchRightOkIdx(s, t, d);
        int ans = rightOkidx - leftiOkdx >= 0 ? rightOkidx - leftiOkdx + 1 : 0;
        System.out.println(ans);

      }
    }
  }

}
