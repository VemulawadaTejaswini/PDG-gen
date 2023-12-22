public class Main{
  static int N = 10000001;
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int[] p;
    int pn, i, n, a;

    p = new int[N / 6];
    pn = getprime(p);

    for(;;){
      n = sc.nextInt();
      if(n == 0)break;
      a = 13;
      for(i = 6;p[i] <= n && i < pn;i++){
        if(p[i] - p[i-1] == 2 && p[i] - p[i-2] == 6 && p[i] - p[i-3] == 8){
          a = p[i];
        }
      }
      out.println(a + " " + pn);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
  private static int getprime(int[] p){
    int i, j, count = 0;
    boolean[] e;
    e = new boolean[N];
    e[0] = true; e[1] = true;
    for(i = 2;i < N;i++)if(!e[i]){
      p[count++] = i;
      for(j = i * 2;j < N;j+=i)e[j] = true;
    }
    return count;
  }
}