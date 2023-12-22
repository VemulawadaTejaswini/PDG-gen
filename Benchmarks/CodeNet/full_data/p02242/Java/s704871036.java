import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int input1 = scan.nextInt();

    int[][] map = new int[input1][input1];
    for(int[] _arr : map) Arrays.fill(_arr,-1);

    for(int i = 0; i < input1; i++) {
      int point = scan.nextInt();
      int input2 = scan.nextInt();
      for(int j = 0; j < input2; j++) {
        int aite = scan.nextInt();
        int omomi = scan.nextInt();

        map[point][aite] = omomi;
      }
    }

    boolean[] moved = new boolean[input1];
    int[] maxInterval = new int[input1];
    Arrays.fill(maxInterval,1<<30);
    maxInterval[0] = 0;
    moved[0] = true;

    check(0,moved,maxInterval,map);

    for(int i = 0; i < maxInterval.length; i++) {
      System.out.println(i+" "+maxInterval[i]);
    }
  }

  static void check(int nowPos, boolean[] moved, int[] maxInterval, int[][] map) {
    for(int i = 0; i < map[nowPos].length; i++) {
      if(map[nowPos][i] >= 0) {
        if(maxInterval[i] > maxInterval[nowPos]+map[nowPos][i]) {
          maxInterval[i] = maxInterval[nowPos]+map[nowPos][i];
        }
      }
    }
    int nextIndex = -1;
    int min = 1<<30;
    for(int i = 0; i < moved.length; i++) {
      if(!moved[i]) {
        if(maxInterval[i] <= min) {
          nextIndex = i;
          min = maxInterval[i];
        }
      }
    }
    if(nextIndex>0) {
      moved[nextIndex] = true;
      check(nextIndex,moved,maxInterval,map);
    }
  }
}