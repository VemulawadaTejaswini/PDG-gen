import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    while(true) {
      int w = sc.nextInt();
      int h = sc.nextInt();

      if(w == 0 && h == 0) {
        break;
      }

      int map[][] = new int[h+2][w+2];
      int searched[][] = new int[h+2][w+2];

      for(int y = 0; y < h+2; y++) {
        for(int x = 0; x < w+2; x++) {
          map[y][x] = 1 <= y && y <= h && 1 <= x && x <= w ? sc.nextInt() : 0;
          searched[y][x] = 0;
        }
      }

      int count = 0;
      for(int y = 1; y <= h; y++) {
        for(int x = 1; x <= w; x++) {
          if(searched[y][x] == 0 && map[y][x] == 1) {
            Queue<Integer> queuey = new ArrayDeque<Integer>();
            Queue<Integer> queuex = new ArrayDeque<Integer>();

            searched[y][x] = 1;
            queuey.add(y);
            queuex.add(x);

            while(!queuey.isEmpty()) {
              int q = queuey.remove();
              int p = queuex.remove();

              if(searched[q-1][p-1] == 0) {
                searched[q-1][p-1] = 1;
                if(map[q-1][p-1] == 1) {
                  queuey.add(q-1);
                  queuex.add(p-1);
                }
              }

              if(searched[q-1][p] == 0) {
                searched[q-1][p] = 1;
                if(map[q-1][p] == 1) {
                  queuey.add(q-1);
                  queuex.add(p);
                }
              }

              if(searched[q-1][p+1] == 0) {
                searched[q-1][p+1] = 1;
                if(map[q-1][p+1] == 1) {
                  queuey.add(q-1);
                  queuex.add(p+1);
                }
              }

              if(searched[q][p-1] == 0) {
                searched[q][p-1] = 1;
                if(map[q][p-1] == 1) {
                  queuey.add(q);
                  queuex.add(p-1);
                }
              }

              if(searched[q][p+1] == 0) {
                searched[q][p+1] = 1;
                if(map[q][p+1] == 1) {
                  queuey.add(q);
                  queuex.add(p+1);
                }
              }

              if(searched[q+1][p-1] == 0) {
                searched[q+1][p-1] = 1;
                if(map[q+1][p-1] == 1) {
                  queuey.add(q+1);
                  queuex.add(p-1);
                }
              }

              if(searched[q+1][p] == 0) {
                searched[q+1][p] = 1;
                if(map[q+1][p] == 1) {
                  queuey.add(q+1);
                  queuex.add(p);
                }
              }

              if(searched[q+1][p+1] == 0) {
                searched[q+1][p+1] = 1;
                if(map[q+1][p+1] == 1) {
                  queuey.add(q+1);
                  queuex.add(p+1);
                }
              }
            }

            count++;
          }
        }
      }

      System.out.println(count);
    }
  }
}