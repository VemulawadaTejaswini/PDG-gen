import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] head1 = br.readLine().split(" ");
    String[] head2 = br.readLine().split(" ");
    String[] head3 = br.readLine().split(" ");

    int h = Integer.parseInt(head1[0]);
    int w = Integer.parseInt(head1[1]);
    int ch = Integer.parseInt(head2[0]) - 1;
    int cw = Integer.parseInt(head2[1]) - 1;
    int dh = Integer.parseInt(head3[0]) - 1;
    int dw = Integer.parseInt(head3[1]) - 1;
    String[] map = new String[h];
    for (int i = 0; i < h; i++) {
      map[i] = br.readLine();
    }
    br.close();

    Queue<Wizard> queueWalk = new ArrayDeque<>();
    Queue<Wizard> queueWarp = new ArrayDeque<>();
    int[][] visit = new int[h][w];
    for (int[] row : visit) {
      Arrays.fill(row, Integer.MAX_VALUE);
    }
    Wizard start = new Wizard(ch, cw, 0);
    visit[ch][cw] = 0;
    queueWarp.add(start);
    while (!queueWarp.isEmpty()) {
      queueWalk.addAll(queueWarp);
      queueWarp.clear();
      while (!queueWalk.isEmpty()) {
        Wizard wizard = queueWalk.poll();
        if (visit[wizard.posH][wizard.posW] < wizard.warp) {
          continue;
        }
        for (int curH = wizard.posH - 2; curH <= wizard.posH + 2; curH++) {
          if (curH < 0 || curH >= h) {
            continue;
          }
          for (int curW = wizard.posW - 2; curW <= wizard.posW + 2; curW++) {
            if (curW < 0 || curW >= w) {
              continue;
            }
            if (map[curH].charAt(curW) == '#') {
              continue;
            }
            if (visit[curH][curW] > wizard.warp) {
              if (Math.abs(curH - wizard.posH) + Math.abs(curW - wizard.posW) == 1) {
                visit[curH][curW] = wizard.warp;
                queueWalk.add(new Wizard(curH, curW, wizard.warp));
              } else {
                visit[curH][curW] = wizard.warp + 1;
                queueWarp.add(new Wizard(curH, curW, wizard.warp + 1));
              }
            }
          }
        }
      }
      if (visit[dh][dw] != Integer.MAX_VALUE) {
        System.out.println(visit[dh][dw]);
        return;
      }
    }
    System.out.println(-1);
  }
}

class Wizard {

  int posH, posW, warp;

  Wizard(int posH, int posW, int warp) {
    this.posH = posH;
    this.posW = posW;
    this.warp = warp;
  }
}
