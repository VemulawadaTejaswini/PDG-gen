public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int q;
    double[] xp0, yp0, xp1, yp1, xp2, yp2, xp3, yp3;
    int i;
    double s1x, s1y, s2x, s2y;

    q = sc.nextInt();
    xp0 = new double[q];
    yp0 = new double[q];
    xp1 = new double[q];
    yp1 = new double[q];
    xp2 = new double[q];
    yp2 = new double[q];
    xp3 = new double[q];
    yp3 = new double[q];

    for(i = 0;i < q;i++){
      xp0[i] = sc.nextDouble();
      yp0[i] = sc.nextDouble();
      xp1[i] = sc.nextDouble();
      yp1[i] = sc.nextDouble();
      xp2[i] = sc.nextDouble();
      yp2[i] = sc.nextDouble();
      xp3[i] = sc.nextDouble();
      yp3[i] = sc.nextDouble();
    }

    for(i = 0;i < q;i++){
      s1x = xp1[i] - xp0[i];
      s1y = yp1[i] - yp0[i];
      s2x = xp3[i] - xp2[i];
      s2y = yp3[i] - yp2[i];

      if((s1y / s1x) == (s2y / s2x)){
        System.out.println("2");
      }else if((s1x * s2x + s1y * s2y) == 0.0){
        System.out.println("1");
      }else{
        System.out.println("0");
      }
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}