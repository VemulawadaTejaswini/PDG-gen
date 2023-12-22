public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, m, i, j, tmp, count = 0;
    int[] t = new int[200];

    n = sc.nextInt();
    for(i = 0;i < n;i++)t[count++] = sc.nextInt() * 60 + sc.nextInt();
    m = sc.nextInt();
    for(i = 0;i < m;i++)t[count++] = sc.nextInt() * 60 + sc.nextInt();
    for(i = 0;i < count - 1;i++)for(j = 0;j < count - 1 - i;j++)
      if(t[j] > t[j + 1]){ tmp = t[j]; t[j] = t[j + 1]; t[j + 1] = tmp; }

    out.printf("%d:%02d", t[0] / 60, t[0] % 60);
    for(i = 1;i < count;i++)if(t[i] != t[i - 1])
      out.printf(" %d:%02d", t[i] / 60, t[i] % 60);
    out.println();

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}