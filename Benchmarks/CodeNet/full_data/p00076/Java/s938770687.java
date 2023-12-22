public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n;
    int i;
    double r, t, x, y;

    for(;;){
      n = sc.nextInt();
      if(n == -1)break;

      r = Math.sqrt(n);
      t = 0;
      for(i = 0;i < n - 1;i++)t += Math.atan(1.0 / Math.sqrt(i + 1));
      x = r * Math.cos(t);
      y = r * Math.sin(t);
      out.printf("%f%n%f%n", x, y);
    }


    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}