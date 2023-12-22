public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int d, s;
    int i;

    for(;sc.hasNext();){
      d = sc.nextInt();
      s = 0;
      for(i = d;i < 600;i+=d)s += d * i * i;
      System.out.println(s);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}