public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, m, i, j, x, y, l, count;
    int[][] f;
    String s;

    f = new int[21][21];

    for(;;){
      n = sc.nextInt();
      if(n == 0)break;
      count = 0;
      for(i = 0;i < 21;i++)for(j = 0;j < 21;j++)f[i][j] = 0;

      for(i = 0;i < n;i++){
        x = sc.nextInt(); y = sc.nextInt(); f[y][x]++;
      }

      m = sc.nextInt(); x = 10; y = 10; f[y][x]--;
      for(i = 0;i < m;i++){
        s = sc.next(); l = sc.nextInt();
        if("N".equals(s))for(j = 0;j < l;j++)f[++y][x]--;
        if("E".equals(s))for(j = 0;j < l;j++)f[y][++x]--;
        if("W".equals(s))for(j = 0;j < l;j++)f[y][--x]--;
        if("S".equals(s))for(j = 0;j < l;j++)f[--y][x]--;
      }

      for(i = 0;i < 21;i++)for(j = 0;j < 21;j++)if(f[i][j] > 0)count++;
      if(count > 0)out.println("No");
      else out.println("Yes");
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}