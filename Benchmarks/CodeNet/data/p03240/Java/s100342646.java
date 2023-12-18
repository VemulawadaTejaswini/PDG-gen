import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int N = scn.nextInt();

    ArrayList<Info> infoList = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      int x = scn.nextInt();
      int y = scn.nextInt();
      int h = scn.nextInt();

      infoList.add(new Info(x, y, h));
    }

    for (int cx = 0; cx <= 100; cx++) {
      for (int cy = 0; cy <= 100; cy++) {
        boolean flg = true;
        long prevH = -1;
        for (Info info : infoList) {
          if (info.h != 0) {
            long curH = Math.abs(info.x - cx) + Math.abs(info.y - cy) + info.h;

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
    int x;
    int y;
    int h;

    Info(int x, int y, int h) {
      this.x = x;
      this.y = y;
      this.h = h;
    }

  }

}
