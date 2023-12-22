public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int a, b, i, j, k, l;

    i = sc.nextInt();
    j = sc.nextInt();
    k = sc.nextInt();
    l = sc.nextInt();
    a = i + j + k + l;

    i = sc.nextInt();
    j = sc.nextInt();
    k = sc.nextInt();
    l = sc.nextInt();
    b = i + j + k + l;
    if(a < b)a = b;
    System.out.println(a);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}