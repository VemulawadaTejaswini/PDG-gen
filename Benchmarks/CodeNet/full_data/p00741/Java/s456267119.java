public class Main{
  static int top;
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int w, h, i, j, res;
    int[][] c;
    int[] nowx, nowy;

    for(;;){
      w = sc.nextInt(); h = sc.nextInt();
      if(w == 0 && h == 0)break;
      c = new int[h][w];
      nowx = new int[h * w]; nowy = new int[h * w];
      for(i = 0;i < h;i++)for(j = 0;j < w;j++)c[i][j] = sc.nextInt();
      res = 0;

      for(i = 0;i < h;i++)for(j = 0;j < w;j++){
        if(c[i][j] == 1){
          res++; top = 0; c[i][j] = 0;
          pushxy(nowx, nowy, i, j);
          for(;top != 0;){
            i = popx(nowx); j = popy(nowy);
            if(i != 0 && c[i - 1][j] == 1){
              c[i - 1][j] = 0; pushxy(nowx, nowy, i - 1, j);
            }
            if(i != 0 && j != 0 && c[i - 1][j - 1] == 1){
              c[i - 1][j - 1] = 0; pushxy(nowx, nowy, i - 1, j - 1);
            }
            if(i != 0 && j != w - 1 && c[i - 1][j + 1] == 1){
              c[i - 1][j + 1] = 0; pushxy(nowx, nowy, i - 1, j + 1);
            }
            if(j != 0 && c[i][j - 1] == 1){
              c[i][j - 1] = 0; pushxy(nowx, nowy, i, j - 1);
            }
            if(j != w - 1 && c[i][j + 1] == 1){
              c[i][j + 1] = 0; pushxy(nowx, nowy, i, j + 1);
            }
            if(i != h - 1 && c[i + 1][j] == 1){
              c[i + 1][j] = 0; pushxy(nowx, nowy, i + 1, j);
            }
            if(i != h - 1 && j != 0 && c[i + 1][j - 1] == 1){
              c[i + 1][j - 1] = 0; pushxy(nowx, nowy, i + 1, j - 1);
            }
            if(i != h - 1 && j != w - 1 && c[i + 1][j + 1] == 1){
              c[i + 1][j + 1] = 0; pushxy(nowx, nowy, i + 1, j + 1);
            }
          }
          i = 0;j = 0;
        }
      }
      out.println(res);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }

  private static int popx(int[] stack){
    return stack[--top];
  }
  private static int popy(int[] stack){
    return stack[top];
  }
  private static void pushxy(int[] stack1, int[] stack2, int x, int y){
    stack1[top] = x;
    stack2[top++] = y;
    return;
  }
}