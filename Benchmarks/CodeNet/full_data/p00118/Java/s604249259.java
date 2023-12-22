public class Main{
  static int top;
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int i, j, h, w, a, x, y;
    char[][] f;
    int[] nowx, nowy;
    int[][] count;
    String s;

    for(;;){
      h = sc.nextInt(); w = sc.nextInt();
      if(h == 0 && w == 0)break;
      f = new char[h][w]; count = new int[h][w];
      nowx = new int[h * w]; nowy = new int[h * w]; top = 0; a = 0;

      for(i = 0;i < h;i++){
        s = sc.next();
        for(j = 0;j < w;j++){
          f[i][j] = s.charAt(j); count[i][j] = 0;
        }
      }

      for(i = 0;i < h;i++)for(j = 0;j < w;j++){
        if(count[i][j] == 0){
          count[i][j]++; a++;
          pushxy(nowx, nowy, i, j);
          for(;top > 0;){
            x = popx(nowx); y = popy(nowy);
            if(x != 0 && f[x][y] == f[x - 1][y] && count[x - 1][y] == 0){
              count[x - 1][y]++;
              pushxy(nowx, nowy, x - 1, y);
            }
            if(x != h - 1 && f[x][y] == f[x + 1][y] && count[x + 1][y] == 0){
              count[x + 1][y]++;
              pushxy(nowx, nowy, x + 1, y);
            }
            if(y != 0 && f[x][y] == f[x][y - 1] && count[x][y - 1] == 0){
              count[x][y - 1]++;
              pushxy(nowx, nowy, x, y - 1);
            }
            if(y != w - 1 && f[x][y] == f[x][y + 1] && count[x][y + 1] == 0){
              count[x][y + 1]++;
              pushxy(nowx, nowy, x, y + 1);
            }
          }
        }
      }

      out.println(a);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
  private static int popx(int[] nowx){
    return nowx[--top];
  }
  private static int popy(int[] nowy){
    return nowy[top];
  }
  private static void pushxy(int[] nowx, int[] nowy, int x, int y){
    nowx[top] = x; nowy[top++] = y;
    return;
  }
}