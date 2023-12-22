public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, w, h, x, y, s, t, count, max, i, j, k, l;
    boolean[][] f;

    for(;;){
      n = sc.nextInt(); if(n == 0)break;
      w = sc.nextInt(); h = sc.nextInt();
      f = new boolean[w][h];
      for(;n-- > 0;){
        x = sc.nextInt(); y = sc.nextInt(); f[x - 1][y - 1] = true;
      }
      s = sc.nextInt(); t = sc.nextInt();
      max = 0;
      for(i = 0;i < w + 1 - s;i++)for(j = 0;j < h + 1 - t;j++){
        count = 0;
        for(k = 0;k < s;k++)for(l = 0;l < t;l++)if(f[i + k][j + l])count++;
        if(max < count)max = count;
      }
      out.println(max);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}