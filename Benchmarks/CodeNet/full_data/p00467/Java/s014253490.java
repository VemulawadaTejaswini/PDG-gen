public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, m, i, t, x;
    int[] f, d;

    for(;;out.println(t)){
      n = sc.nextInt(); m = sc.nextInt();
      if(n == 0 && m == 0)break;
      f = new int[n]; d = new int[m];
      for(i = 0;i < n;i++)f[i] = sc.nextInt();
      for(i = 0;i < m;i++)d[i] = sc.nextInt();
      x = 0;
      for(t = 0;x < n - 1;){
        x += d[t++];
        if(x < n - 1)x += f[x];
      }
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}