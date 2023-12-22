public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n;
    double[] s;
    int i;
    double a, ave;

    for(;;){
      n = sc.nextInt();
      if(n == 0)break;
      s = new double[n];
      for(i = 0;i < n;i++){
        s[i] = sc.nextDouble();
      }

      ave = 0.0;
      for(i = 0;i < n;i++){
        ave += (double)s[i];
      }
      ave /= (double)n;

      a = 0.0;
      for(i = 0;i < n;i++){
        a += (s[i] - ave) * (s[i] - ave);
      }
      a /= (double)n;
      System.out.println(Math.sqrt(a));
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}