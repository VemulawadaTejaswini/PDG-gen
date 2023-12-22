public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    double a, s;
    int i;

    for(;sc.hasNext();){
      a = sc.nextDouble();
      s = a * 3.0;
      a *= 2.0;
      for(i = 0;i < 4;i++){
        a /= 3.0; s += a;
        a *= 2.0; s += a;
      }
      out.println(s);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}