public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int a, b, n, s, i;

    for(;sc.hasNext();){
      a = sc.nextInt(); b = sc.nextInt(); n = sc.nextInt();
      s = 0;
      if(a >= b)a %= b;
      for(;n-- > 0;){
        a *= 10;
        s += a / b;
        a %= b;
      }
      out.println(s);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}