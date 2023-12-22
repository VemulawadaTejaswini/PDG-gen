public class Main{
  static int head, tail;
  static int infi = 1000001;
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int h, w, i, j, k, x, y, max;
    int[] nowx, nowy;
    int[][] c;
    char[][] f;
    String s;

    h = sc.nextInt(); w = sc.nextInt();
    c = new int[h][w]; f = new char[h][w];
    nowx = new int[h * w]; nowy = new int[h * w];
    for(i = 0;i < h;i++){
      s = sc.next();
      for(j = 0;j < w;j++){
        f[i][j] = s.charAt(j);
        c[i][j] = infi;
        if(f[i][j] == '.')c[i][j] = 0;
      }
    }

    for(i = 0;i < h;i++)for(j = 0;j < w;j++){
      if(judge(c, f, i, j, h, w))enqueuexy(nowx, nowy, h * w, i, j);
      for(;head != tail;){
        x = dequeuex(nowx, h * w); y = dequeuey(nowy, h * w);
        if(judge(c, f, x - 1, y - 1, h, w))
          enqueuexy(nowx, nowy, h * w, x - 1, y - 1);
        if(judge(c, f, x - 1, y, h, w))
          enqueuexy(nowx, nowy, h * w, x - 1, y);
        if(judge(c, f, x - 1, y + 1, h, w))
          enqueuexy(nowx, nowy, h * w, x - 1, y + 1);
        if(judge(c, f, x, y + 1, h, w))
          enqueuexy(nowx, nowy, h * w, x, y + 1);
        if(judge(c, f, x + 1, y + 1, h, w))
          enqueuexy(nowx, nowy, h * w, x + 1, y + 1);
        if(judge(c, f, x + 1, y, h, w))
          enqueuexy(nowx, nowy, h * w, x + 1, y);
        if(judge(c, f, x + 1, y - 1, h, w))
          enqueuexy(nowx, nowy, h * w, x + 1, y - 1);
        if(judge(c, f, x, y - 1, h, w))
          enqueuexy(nowx, nowy, h * w, x, y - 1);
      }
    }

    max = 0;
    for(i = 0;i < h;i++)for(j = 0;j < w;j++)
      if(max < c[i][j] && c[i][j] != infi)max = c[i][j];

    out.println(max);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
  private static boolean judge(int[][] c, char[][] f,
                                  int i, int j, int h, int w){
    int count, a;
    int[] d;
    d = new int[8];

    if(f[i][j] != '.' && f[i][j] != '9'){
      count = dotcount(c, d, i, j, h, w);
      a = (int)(f[i][j] - '0');
      if(count >= a){
        sort(d, count);
        if(c[i][j] > d[a - 1] + 1){
          c[i][j] = d[a - 1] + 1; return true;
        }
      }
    }
    return false;
  }
  private static int dotcount(int[][] c, int[] d, int i, int j, int h, int w){
    int count = 0;
    if(i != 0 && j != 0 && c[i - 1][j - 1] < infi){
      d[count] = c[i - 1][j - 1]; count++;
    }
    if(j != 0 && c[i][j - 1] < infi){
      d[count] = c[i][j - 1]; count++;
    }
    if(i != h - 1 && j != 0 && c[i + 1][j - 1] < infi){
      d[count] = c[i + 1][j - 1]; count++;
    }
    if(i != h - 1 && c[i + 1][j] < infi){
      d[count] = c[i + 1][j]; count++;
    }
    if(i != h - 1 && j != w - 1 && c[i + 1][j + 1] < infi){
      d[count] = c[i + 1][j + 1]; count++;
    }
    if(j != w - 1 && c[i][j + 1] < infi){
      d[count] = c[i][j + 1]; count++;
    }
    if(i != 0 && j != w - 1 && c[i - 1][j + 1] < infi){
      d[count] = c[i - 1][j + 1]; count++;
    }
    if(i != 0 && c[i - 1][j] < infi){
      d[count] = c[i - 1][j]; count++;
    }
    return count;
  }

  private static void sort(int[] d, int n){
    int i, j, tmp;
    for(i = 0;i < n - 1;i++)for(j = 0;j < n - 1 - i;j++)if(d[j] > d[j + 1]){
        tmp = d[j]; d[j] = d[j + 1]; d[j + 1] = tmp;
    }
    return;
  }

  private static void enqueuexy(int[] nowx, int[] nowy, int n, int x, int y){
    nowx[tail] = x; nowy[tail] = y;
    tail = (tail + 1) % (n + 1);
  }

  private static int dequeuex(int[] nowx, int n){
    return nowx[head % (n + 1)];
  }
  private static int dequeuey(int[] nowy, int n){
    head = (head + 1) % (n + 1);
    return nowy[(n + head) % (n + 1)];
  }

  private static boolean isnotEmpty(){
    if(head == tail)return false;
    else return true;
  }
}