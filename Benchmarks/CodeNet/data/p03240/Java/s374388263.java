import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    long N = scn.nextInt();

    ArrayList<Info> infoList = new ArrayList<>();
    for (long i = 0; i < N; i++) {
      long x = scn.nextInt();
      long y = scn.nextInt();
      long h = scn.nextInt();

      infoList.add(new Info(x, y, h));
    }

    for (long cx = 0; cx <= 100; cx++) {
      for (long cy = 0; cy <= 100; cy++) {
        boolean flg = true;
        long prevH = -1;
        for (Info info : infoList) {
          if (info.h != 0) {
            long curH = Math.abs(info.x - cx) + Math.abs(info.y - cy) + info.h;
            curH = Math.max(curH, 0L);

            if (prevH == -1) {
              prevH = curH;
            } else if (curH != prevH) {
              flg = false;
              break;
            }
            prevH = curH;

          }

        }

        if (flg) {
          System.out.printf("%d %d %d\n", cx, cy, prevH);
        }

      }
    }

  }

  public static class Info {
    long x;
    long y;
    long h;

    Info(long x, long y, long h) {
      this.x = x;
      this.y = y;
      this.h = h;
    }

  }

}
