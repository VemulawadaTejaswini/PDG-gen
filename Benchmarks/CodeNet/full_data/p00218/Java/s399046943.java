public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, pm, pe, pj;
    for(;;){
      n = sc.nextInt(); if(n == 0)break;
      for(;n-- > 0;out.println(solve(pm, pe, pj))){
        pm = sc.nextInt(); pe = sc.nextInt(); pj = sc.nextInt();
      }
    }
    sc.close();
  }
  private static String solve(int m, int e, int j){
    if(m == 100)return "A";
    if(e == 100)return "A";
    if(j == 100)return "A";
    if(m + e >= 180)return "A";
    if(m + e + j >= 240)return "A";
    if(m + e + j >= 210)return "B";
    if(m + e + j >= 150 && m >= 80)return "B";
    if(m + e + j >= 150 && e >= 80)return "B";
    return "C";
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}