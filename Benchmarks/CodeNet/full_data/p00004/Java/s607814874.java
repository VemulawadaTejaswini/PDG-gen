public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    double a, b, c, d, e, f, x, y;

    for(;sc.hasNext();){
      a = sc.nextDouble();
      b = sc.nextDouble();
      c = sc.nextDouble();
      d = sc.nextDouble();
      e = sc.nextDouble();
      f = sc.nextDouble();

      x = (e * c - b * f) / (a * e - b * d);
      y = (-d * c + a * f) / (a * e - b * d);
      if(e * c - b * f == 0)x = 0;
      if(-d * c + a * f == 0)y = 0;

      System.out.printf("%.3f %.3f%n", x, y);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}