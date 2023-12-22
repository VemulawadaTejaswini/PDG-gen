public class Main{
  static int N = 200275;
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int[] p1, p2, psum;
    int p, n, pn, i, j, count, tmp;

    for(;;){
      n = sc.nextInt(); p = sc.nextInt();
      if(n == -1 && p == -1)break;
      p1 = new int[N / 6]; pn = getprime(p1, n);
      p2 = new int[pn]; pn = getprime(p2, n);

      psum = new int[pn * pn];
      count = 0;
      for(i = 0;i < pn;i++)for(j = i;j < pn;j++)psum[count++] = p1[i] + p2[j];
      for(i = 0;i < count - 1;i++)for(j = 0;j < count - 1 - i;j++)
        if(psum[j] > psum[j + 1]){
        tmp = psum[j]; psum[j] = psum[j + 1]; psum[j + 1] = tmp;
        }
      out.println(psum[p - 1]);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
  private static int getprime(int[] p, int n){
    int i, j, count = 0;
    boolean[] e;
    e = new boolean[N];
    e[0] = true; e[1] = true;
    for(i = 2;i < N && count < 101;i++)if(!e[i]){
      if(i > n)p[count++] = i;
      for(j = i * 2;j < N;j+=i)e[j] = true;
    }
    return count;
  }
}