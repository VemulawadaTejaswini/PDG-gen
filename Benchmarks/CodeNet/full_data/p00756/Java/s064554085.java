import java.util.Arrays;
import java.util.Scanner;

public class Main {

  Scanner sc;

  Main() {
    sc = new Scanner(System.in);
  }

  int ni() {
    return sc.nextInt();
  }

  public static void main(String[] args) {
    new Main().run();
  }

  class Disk {
    byte x;
    byte y;
    byte c;
    byte r;

    boolean isIn(Disk disk) {
      return (this.r + disk.r) * (this.r + disk.r) > (this.x - disk.x) * (this.x - disk.x) + (this.y - disk.y) * (this.y - disk.y);
    }
  }

  void run() {
    for (; ; ) {
      int n = ni();
      if (n == 0) {
        break;
      }
      Disk[] list = new Disk[n];
      for (int i = 0; i < n; ++i) {
        Disk d = new Disk();
        d.x = (byte) ni();
        d.y = (byte) ni();
        d.r = (byte) ni();
        d.c = (byte) ni();
        list[i] = d;
      }

      byte[] dp = new byte[1 << n];
      Arrays.fill(dp, (byte) -1);
      dp[0] = 0;
      for (int i = 0; i < 1 << n; ++i) {
        if (dp[i] < 0) {
          continue;
        }
        for (int j = 0; j < n; ++j) {
          if (((i >> j) & 1) == 1) {
            continue;
          }
          boolean flag = true;
          for (int a = 0; a < j; ++a) {
            if (((i >> a) & 1) == 1) {
              continue;
            }
            flag &= !list[j].isIn(list[a]);
          }
          if (!flag) {
            continue;
          }
          for (int k = j + 1; k < n; ++k) {
            if (((i >> k) & 1) == 1) {
              continue;
            }
            boolean glag = true;
            for (int a = 0; a < k; ++a) {
              if (((i >> a) & 1) == 1) {
                continue;
              }
              glag &= !list[k].isIn(list[a]);
            }
            if (!glag) {
              continue;
            }
            if (list[j].c != list[k].c) {
              continue;
            }

//            debug(j, k);

            dp[i | (1 << j) | (1 << k)] = (byte) Math.max(dp[i] + 1, dp[i | (1 << j) | (1 << k)]);
          }
        }
      }
      int max = 0;
      for (int i = 0; i < 1 << n; ++i) {
        max = Math.max(max, dp[i]);
      }

      System.out.println(max * 2);
    }
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}