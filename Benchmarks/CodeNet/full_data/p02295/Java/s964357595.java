//CGL_2_C
public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    double xp0, xp1, yp0, yp1, xp2, yp2, xp3, yp3;
    int q;
    int i;
    double s0x, s0y, s1x, s1y, s, t, x, y;

    q = sc.nextInt();
    for(i = 0;i < q;i++){
      xp0 = sc.nextDouble();
      yp0 = sc.nextDouble();
      xp1 = sc.nextDouble();
      yp1 = sc.nextDouble();
      xp2 = sc.nextDouble();
      yp2 = sc.nextDouble();
      xp3 = sc.nextDouble();
      yp3 = sc.nextDouble();

      s0x = xp1 - xp0;
      s0y = yp1 - yp0;
      s1x = xp3 - xp2;
      s1y = yp3 - yp2;

      s = s0x * s1y - s1x * s0y;

      if(xp0 == xp2 && yp0 == yp2){
        x = xp0;
        y = yp0;
      }else if(xp0 == xp3 && yp0 == yp3){
        x = xp0;
        y = yp0;
      }else if(xp1 == xp2 && yp1 == yp2){
        x = xp1;
        y = yp1;
      }else if(xp1 == xp3 && yp1 == yp3){
        x = xp1;
        y = yp1;
      }else{
        t = (s1y * (xp2 - xp0) - s1x * (yp2 - yp0)) / s;
        x = xp0 + t * s0x;
        y = yp0 + t * s0y;
      }

      System.out.println(x + " " + y);
    }

/*fin*/
    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}