public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int a, b, c, d, e, min1, min2;

    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    d = sc.nextInt();
    e = sc.nextInt();

    min1 = a;
    if(min1 > b)min1 = b;
    if(min1 > c)min1 = c;
    min2 = d;
    if(min2 > e)min2 = e;

    out.println(min1 + min2 - 50);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}