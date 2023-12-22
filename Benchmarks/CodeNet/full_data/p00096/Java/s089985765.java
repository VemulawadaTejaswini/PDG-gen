public class Main{
  static int N = 4001;
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int[] ab, cd;
    int i, j, n, sum;

    ab = new int[N]; cd = new int[N];

    for(i = 0;i <= 1000;i++)for(j = 0;j <= 1000;j++)ab[i + j]++;
    for(i = 0;i < N;i++)cd[i] = ab[i];

    for(;sc.hasNext();){
      n = sc.nextInt();
      sum = 0;
      for(i = 0;i <= n;i++)sum += ab[i] * cd[n - i];
      out.println(sum);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}