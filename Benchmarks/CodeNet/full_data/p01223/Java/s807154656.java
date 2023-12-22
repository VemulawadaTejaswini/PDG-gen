public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int t, n, u, d, i, a, b;

    t = sc.nextInt();
    for(;t-- > 0;){
      n = sc.nextInt();
      u = 0; d = 0;
      a = sc.nextInt();
      for(i = 1;i < n;i++){
        b = sc.nextInt();
        if(b - a > 0 && b - a > u)u = b - a;
        if(a - b > 0 && a - b > d)d = a - b;
        a = b;
      }
      out.println(u + " " + d);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}