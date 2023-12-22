public class Main{
  static int N = 4000;
  static int M = 1000000;
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int[] a, b;
    int i, n, x, count;
    int y, z;

    a = new int[N]; b = new int[N];
    for(;;){
      n = sc.nextInt();
      if(n == 0)break;
      for(i = 0;i < N;i++){
        a[i] = 0; b[i] = 0;
      }
      count = 0;
      for(i = 0;i < n;i++){
        x = sc.nextInt(); y = sc.nextInt(); z = sc.nextInt();
        if(z != 0 && ((M - a[x - 1]) / z < y ||
         ((M - a[x - 1]) / z == y && ((M - a[x - 1]) % z) == 0)))b[x - 1]++;
        a[x - 1] += y * z;
      }

      for(i = 0;i < N;i++)if(b[i] > 0){
        out.println(i + 1); count++;
      }
      if(count == 0)out.println("NA");
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}