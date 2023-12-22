public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n;
    double xa, ya, ra, xb, yb, rb;
    int i;
    double d;

    n = sc.nextInt();
    for(i = 0;i < n;i++){
      xa = sc.nextDouble();
      ya = sc.nextDouble();
      ra = sc.nextDouble();
      xb = sc.nextDouble();
      yb = sc.nextDouble();
      rb = sc.nextDouble();
      d = Math.sqrt((xb - xa) * (xb - xa) + (yb - ya) * (yb - ya));

      if(ra > d + rb)out.println("2");
      else if(rb > d + ra)out.println("-2");
      else if(ra + rb < d)out.println("0");
      else out.println("1");
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}