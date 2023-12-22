public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int a, b, c, h, m, s, i, t;

    for(i = 3;i-- > 0;){
      a = sc.nextInt(); b = sc.nextInt(); c = sc.nextInt();
      h = sc.nextInt(); m = sc.nextInt(); s = sc.nextInt();
      t = (h - a) * 3600 + (m - b) * 60 + (s - c);
      out.printf("%d %d %d%n", t / 3600, (t / 60) % 60, t % 60);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}