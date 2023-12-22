public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, y, m, d, res, i;

    n = sc.nextInt();
    for(i = 0;i < n;i++){
      y = sc.nextInt(); m = sc.nextInt(); d = sc.nextInt();
      res = d;

      if(y % 3 == 0)res += (m - 1) * 20;
      else if(m % 2 == 1)res += (m - 1) / 2 * 39;
      else res += (m - 2) / 2 * 39 + 20;

      if(y % 3 == 1)res += (y - 1) / 3 * 590;
      else if(y % 3 == 2)res += (y - 2) / 3 * 590 + 195;
      else res += (y - 3) / 3 * 590 + 390;

      out.println(196471 - res);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}