public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n;
    for(;sc.hasNext();){
      n = sc.nextInt();
      n %= 39;
      if(n == 0)n = 39;
      out.printf("3C%02d%n", n);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}