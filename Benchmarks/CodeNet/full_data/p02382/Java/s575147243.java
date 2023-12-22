public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n;
    double[] x, y;
    double d1, d2, d3, di, a;
    int i;

    n = sc.nextInt();
    x = new double[n];
    y = new double[n];

    for(i = 0;i < n;i++){
      x[i] = sc.nextDouble();
    }
    for(i = 0;i < n;i++){
      y[i] = sc.nextDouble();
    }

    d1 = 0.0;
    d2 = 0.0;
    d3 = 0.0;
    di = 0.0;
    for(i = 0;i < n;i++){
      a = Math.abs(x[i] - y[i]);
      d1 += a;
      d2 += a * a;
      d3 += a * a * a;
      if(di < a)di = a;
    }

    System.out.println(d1);
    System.out.println(Math.sqrt(d2));
    System.out.println(Math.cbrt(d3));
    System.out.println(di);


    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}
