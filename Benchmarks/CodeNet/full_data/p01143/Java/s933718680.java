public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, m, p, i, sum;
    int[] x;

    for(;;){
      n = sc.nextInt(); m = sc.nextInt(); p = sc.nextInt();
      if(n == 0 && m == 0 && p == 0)break;

      x = new int[n]; sum = 0;
      for(i = 0;i < n;i++){
        x[i] = sc.nextInt(); sum += x[i];
      }
      if(x[m - 1] == 0)out.println("0");
      else out.println(sum * (100 - p) / x[m - 1]);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}