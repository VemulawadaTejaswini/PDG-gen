public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    double xp0, xp1, yp0, yp1;
    int q;
    double[] xp2, yp2;
    int i;
    double s1x, s1y, s2x, s2y, s;

    xp0 = sc.nextDouble();
    yp0 = sc.nextDouble();
    xp1 = sc.nextDouble();
    yp1 = sc.nextDouble();
    q = sc.nextInt();
    xp2 = new double[q];
    yp2 = new double[q];

    s1x = xp1 - xp0;
    s1y = yp1 - yp0;

    for(i = 0;i < q;i++){
      xp2[i] = sc.nextDouble();
      yp2[i] = sc.nextDouble();
      s2x = xp2[i] - xp0;
      s2y = yp2[i] - yp0;

      s = s1x * s2y - s1y * s2x;

      if(s > 0){
        System.out.println("COUNTER_CLOCKWISE");
      }else if(s < 0){
        System.out.println("CLOCKWISE");
      }else{
        if(s1x * s2x < 0){
          System.out.println("ONLINE_BACK");
        }else{
          if(((s1x * s1x) + (s1y * s1y)) < ((s2x * s2x) + (s2y * s2y))){
            System.out.println("ONLINE_FRONT");
          }else{
            System.out.println("ON_SEGMENT");
          }
        }
      }
    }
    sc.close();


  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}