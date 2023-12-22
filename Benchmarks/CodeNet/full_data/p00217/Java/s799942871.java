public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, i, p, d, maxd, maxp;
    for(;;out.println(maxp + " " + maxd)){
      n = sc.nextInt(); if(n == 0)break;
      maxd = -1; maxp = -1;
      for(;n-- > 0;){
        p = sc.nextInt();
        d = sc.nextInt() + sc.nextInt();
        if(d > maxd){
          maxd = d; maxp = p;
        }
      }
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}