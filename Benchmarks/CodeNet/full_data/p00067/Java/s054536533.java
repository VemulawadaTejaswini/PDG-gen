public class Main{
  static int top;
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    String s;
    char[][] f;
    int i, j, k, h, w, count;
    int[] nowh, noww, di, dj;

    f = new char[14][14]; nowh = new int[144]; noww = new int[144];
    di = new int[4]; dj = new int[4];
    di[0] = -1; di[1] = 0; di[2] = 1; di[3] = 0;
    dj[0] = 0; dj[1] = -1; dj[2] = 0; dj[3] = 1;
    for(;sc.hasNext();){
      for(i = 1;i < 13;i++){
        s = sc.next();
        for(j = 1;j < 13;j++)f[i][j] = s.charAt(j - 1);
      }

      top = 0; count = 0;
      for(i = 1;i < 13;i++)for(j = 1;j < 13;j++)if(f[i][j] == '1'){
        count++;
        f[i][j] = '0';
        pushhw(nowh, noww, i, j);
        for(;top > 0;){
          h = poph(nowh); w = popw(noww);
          for(k = 0;k < 4;k++)if(f[h + di[k]][w + dj[k]] == '1'){
            f[h + di[k]][w + dj[k]] = '0';
            pushhw(nowh, noww, h + di[k], w + dj[k]);
          }
        }
      }

      out.println(count);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
  private static int poph(int[] nowh){
    return nowh[--top];
  }
  private static int popw(int[] noww){
    return noww[top];
  }
  private static void pushhw(int[] nowh, int[] noww, int h, int w){
    nowh[top] = h; noww[top++] = w;
    return;
  }
}