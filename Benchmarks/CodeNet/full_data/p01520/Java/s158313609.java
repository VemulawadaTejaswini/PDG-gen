public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, t, e, x, i, j;

    n = sc.nextInt(); t = sc.nextInt(); e = sc.nextInt();
    for(i = 0;i < n;i++){
      x = sc.nextInt();
      for(j = 1;x * j <= t + e;j++)if(t - e <= x * j)break;
      if(t - e <= x * j && x * j <= t + e){
        out.println(i + 1); break;
      }
    }
    if(i == n)out.println("-1");

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}