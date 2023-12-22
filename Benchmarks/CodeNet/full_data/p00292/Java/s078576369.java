public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, k, p;

    n = sc.nextInt();
    for(;n > 0;n--){
      k = sc.nextInt(); p = sc.nextInt();
      k %= p;
      if(k == 0)k = p;
      out.println(k);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}