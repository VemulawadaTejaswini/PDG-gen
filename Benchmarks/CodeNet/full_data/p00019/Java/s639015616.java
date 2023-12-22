public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int i, n;
    long a;

    n = sc.nextInt();
    a = 1;
    for(i = 0;i < n;i++)a *= (i + 1);
    System.out.println(a);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}