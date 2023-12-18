import java.io.*;
import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int d = sc.nextInt();
    int[][] pos = new int[h*w+1][2];
    for(int i = 0; i < h; i++) {
      for(int j = 0; j < w; j++) {
        int curr = sc.nextInt();
        int[] coords = new int[2];
        coords[0] = i;
        coords[1] = j;
        pos[curr] = coords;
      }
    }
    int q = sc.nextInt();
    for(int i = 0; i < q; i++) {
      int sum = 0;
      int l = sc.nextInt();
      int r = sc.nextInt();
      for(int j = l; j < r; j+= d) {
        sum += (Math.abs(pos[j+d][0]-pos[j][0])+Math.abs(pos[j+d][1]-pos[j][1]));
      }
      System.out.println(sum);
    }
  }
}
 