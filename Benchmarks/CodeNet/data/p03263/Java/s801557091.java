import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int[][] a = new int[h][w];

    for (int i=0;i<h;++i){
      for (int j=0;j<w;++j){
        a[i][j] =sc.nextInt();
      }
    }

    int n = 0;
    ArrayList<int[]> list = new ArrayList<int[]>();

    for(int i = 0; i < h; i++) {
      if((i + j) < h + w - 2) {
        if(i % 2 == 0) {
          for(int j = 0; j < w; j++) {
            if(a[i][j] % 2 == 1) {
              int[] s = {i, j};
              list.add(s);
              n++;
              if(j < w - 1) {
                a[i][j + 1]++;
                int[] t = {i, j + 1};
              } else {
                a[i + 1][j]++;
                int[] t = {i + 1, j};
              }
              list.add(t);
            }
          }
        } else {
          for(int j = w - 1; j >= 0; j--) {
            if(a[i][j] % 2 == 1) {
              int[] s = {i, j};
              list.add(s);
              n++;
              if(j > 0) {
                a[i][j - 1]++;
                int[] t = {i, j - 1};
              } else {
                a[i + 1][j]++;
                int[] t = {i + 1, j};
              }
              list.add(t);
            }
          }
        }
      }
    }

    System.out.println(n);

    for(int i = 0; i < list.size() - 1; i++) {
      int[] s = list.get(i);
      int[] t = list.get(i + 1);
      System.out.print(s[0]);
      System.out.print(" ");
      System.out.print(s[1]);
      System.out.print(" ");
      System.out.print(t[0]);
      System.out.print(" ");
      System.out.print(t[1]);
      System.out.println();
    }

  }
}