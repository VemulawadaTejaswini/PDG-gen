public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, m, i, j, tmp;
    int[] a, b;
    for(;;){
      n = sc.nextInt(); m = sc.nextInt();
      if(n == 0 && m == 0)break;
      a = new int[m]; b = new int[m];
      for(i = 0;i < m;i++)b[i] = i + 1;
      for(i = 0;i < n;i++)for(j = 0;j < m;j++)a[j] += sc.nextInt();
      for(i = 0;i < m - 1;i++)for(j = 0;j < m - 1 - i;j++)if(a[j] < a[j + 1]){
        tmp = a[j]; a[j] = a[j + 1]; a[j + 1] = tmp;
        tmp = b[j]; b[j] = b[j + 1]; b[j + 1] = tmp;
      }
      for(i = 0;i < m - 1;i++)out.print(b[i] + " ");
      out.println(b[i]);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}