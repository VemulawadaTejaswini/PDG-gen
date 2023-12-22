public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, m, i, j, tmp, sum;
    int[] d, p;

    for(;;){
      n = sc.nextInt(); m = sc.nextInt();
      if(n == 0 && m == 0)break;
      d = new int[n]; p = new int[n];
      for(i = 0;i < n;i++){
        d[i] = sc.nextInt(); p[i] = sc.nextInt();
      }
      for(i = 0;i < n - 1;i++)for(j = 0;j < n - 1 - i;j++)if(p[j] < p[j + 1]){
        tmp = d[j]; d[j] = d[j + 1]; d[j + 1] = tmp;
        tmp = p[j]; p[j] = p[j + 1]; p[j + 1] = tmp;
      }
      for(i = 0;i < n;i++){
        if(m >= d[i]){
          m -= d[i]; d[i] = 0;
        }else{
          d[i] -= m; m = 0; break;
        }
      }
      if(m > 0)out.println("0");
      else{
        for(sum = 0;i < n;i++)sum += d[i] * p[i];
        out.println(sum);
      }
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}