public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n, i, v, max, m, mmin;

    n = sc.nextInt();
    max = -1; mmin = -1;
    for(i = 0;i < n;i++){
      m = sc.nextInt(); v = sc.nextInt();
      if(max < v || (max == v && mmin > m)){
        max = v; mmin = m;
      }
    }
    out.println(mmin + " " + max);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}