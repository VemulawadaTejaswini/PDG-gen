public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int a;

    for(;;){
      a = sc.nextInt();
      if(a == -1)break;
      out.printf("%.6f%n", Math.cbrt(a));
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}