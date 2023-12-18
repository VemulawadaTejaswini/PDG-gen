import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    ArrayList<int[]> list = new ArrayList<int[]>();
    for(int i = 0; i < h; i++) {
      for(int j = 0; j < w; j++) {
        int a = sc.nextInt();
        if(a % 2 == 1) {
          int[] m = {i, j};
          list.add(m);
        }
      }
      sc.nextLine();
    }
    int n = 0;
    if(list.size() <= 1) {
      System.out.println(n);
    } else {
      int k = (list.size()) / 2;
      for(int i = 0; i < k; i++) {
        int[] u = list.get(2 * i);
        int[] t = list.get(2 * i + 1);
        n += (Math.abs(u[0] - t[0]) + Math.abs(u[1] - t[1]));
      }
      System.out.println(n);
      for(int i = 0; i < k; i++) {
        int[] u = list.get(2 * i);
        int[] t = list.get(2 * i + 1);
        int x1 = u[0];
        int x2 = t[0];
        int y1 = u[1];
        int y2 = t[1];
        int p = 0;
        for(int j = 0; j < Math.abs(x1 - x2); j++) {
          if(x1 < x2) {
            System.out.print(x1);
            System.out.print(" ");
            System.out.print(y1);
            System.out.print(" ");
            System.out.print(x1 + 1);
            System.out.print(" ");
            System.out.print(y1);
            System.out.println();
            x1 += 1;
          } else {
            p = 1;
            System.out.print(x2);
            System.out.print(" ");
            System.out.print(y2);
            System.out.print(" ");
            System.out.print(x2 + 1);
            System.out.print(" ");
            System.out.print(y2);
            System.out.println();
            x2 += 1;
          }
        }
        for(int j = 0; j < Math.abs(y1 - y2); j++) {
          if(p == 0) {
            if(y1 < y2) {
              System.out.print(x2);
              System.out.print(" ");
              System.out.print(y1);
              System.out.print(" ");
              System.out.print(x2);
              System.out.print(" ");
              System.out.print(y1 + 1);
              System.out.println();
              y1 += 1;
            } else {
              System.out.print(x2);
              System.out.print(" ");
              System.out.print(y1);
              System.out.print(" ");
              System.out.print(x2);
              System.out.print(" ");
              System.out.print(y1 - 1);
              System.out.println();
              y1 -= 1;
            }
          } else {
            if(y2 < y1) {
              System.out.print(x1);
              System.out.print(" ");
              System.out.print(y2);
              System.out.print(" ");
              System.out.print(x1);
              System.out.print(" ");
              System.out.print(y2 + 1);
              System.out.println();
              y2 += 1;
            } else {
              System.out.print(x1);
              System.out.print(" ");
              System.out.print(y2);
              System.out.print(" ");
              System.out.print(x1);
              System.out.print(" ");
              System.out.print(y2 - 1);
              System.out.println();
              y2 -= 1;
            }
          }
        }
      }
    }
  }
}