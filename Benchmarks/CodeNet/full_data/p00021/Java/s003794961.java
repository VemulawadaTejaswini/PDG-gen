public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n;
    double x1, x2, x3, x4, y1, y2, y3, y4;
    int i;

    n = sc.nextInt();
    for(i = 0;i < n;i++){
      x1 = sc.nextDouble();
      y1 = sc.nextDouble();
      x2 = sc.nextDouble();
      y2 = sc.nextDouble();
      x3 = sc.nextDouble();
      y3 = sc.nextDouble();
      x4 = sc.nextDouble();
      y4 = sc.nextDouble();

      if((x1 - x2) * (y3 - y4) - (x3 - x4) * (y1 - y2) == 0
        && (x1 - x2) * (y1 - y3) - (x1 - x3) * (y1 - y2) != 0){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}