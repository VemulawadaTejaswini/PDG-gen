import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.TreeSet;

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
    int[][] warp_count_tbl = new int[h][w];
    for (int i = 0; i < h; i++) {
      map[i] = br.readLine();
      Arrays.fill(warp_count_tbl[i], Integer.MAX_VALUE);
    }

    Queue<Player> queue = new ArrayDeque<>();
    Queue<Player> queue2 = new ArrayDeque<>();
    Player start = new Player(ch, cw);
    int warp_count = 0;
    warp_count_tbl[start.h][start.w] = warp_count;
    TreeSet<Player> set = new TreeSet<>();
    queue2.add(start);
    while (!queue2.isEmpty()) {
      queue.addAll(queue2);
      queue2.clear();
      while (!queue.isEmpty()) {
        Player player = queue.poll();
        if (warp_count_tbl[player.h][player.w] < warp_count) {
          continue;
        }
        if (player.h == dh && player.w == dw) {
          continue;
        }
        for(int i = player.h - 2; i <= player.h + 2; i++){
          if(i < 0 || i >= h){
            continue;
          }
          for(int j = player.w - 2; j <= player.w + 2; j++){
            if(j < 0 || j >= w){
              continue;
            }
            if(map[i].charAt(j) != '.'){
              continue;
            }
            if(warp_count_tbl[i][j] <= warp_count){
              continue;
            }
            if(Math.abs(player.h - i) + Math.abs(player.w - j) == 1){
              // Up Down Left Right
              warp_count_tbl[i][j] = warp_count;
              queue.add(new Player(i, j));
            } else if (warp_count_tbl[i][j] > warp_count + 1){
              // Warp
              warp_count_tbl[i][j] = warp_count + 1;
              set.add(new Player(i, j));
            }
          }
        }
      }
      warp_count++;
      for (Player p : set) {
        if (warp_count_tbl[p.h][p.w] == warp_count) {
          queue2.add(p);
        }
      }
      set.clear();
    }
    System.out.println(warp_count_tbl[dh][dw] == Integer.MAX_VALUE ? -1 : warp_count_tbl[dh][dw]);
  }

  static class Player implements Comparable<Player> {
    int h;
    int w;

    public Player(int h, int w) {
      this.h = h;
      this.w = w;
    }
    @Override
    public int compareTo(Player o) {
      if (this.h != o.h) {
        return Integer.compare(this.h, o.h);
      }
      return Integer.compare(this.w, o.w);
    }
  }
}