public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    double q, x;
    for(;;out.println(x)){
      q = sc.nextDouble();
      if(q == -1)break;
      x = q / 2.0;
      for(;x * x * x - q >= 0.00001 * q || x * x * x - q <= -0.00001 * q;)
        x -= (x * x * x - q) / (3 * x * x);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}