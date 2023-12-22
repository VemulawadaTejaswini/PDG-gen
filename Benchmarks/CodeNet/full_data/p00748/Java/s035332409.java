public class Main{
  static int N = 1000000;
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int[] a, b, c;
    int i, j, n;

    a = new int[180];
    b = new int[N]; c = new int[N];

    for(i = 0;i < N;i++){
      b[i] = N; c[i] = N;
    }
    for(i = 1;i * (i + 1) * (i + 2) / 6 < N;i++){
      a[i - 1] = i * (i + 1) * (i + 2) / 6;
      b[a[i - 1] - 1] = 1;
      if((i * (i + 1) * (i + 2) / 6) % 2 == 1)c[a[i - 1] - 1] = 1;
    }

    for(i = 0;i < N;i++){
      for(j = 0;j < 180;j++){
        if(i + a[j] < N && b[i + a[j]] > b[i] + 1)b[i + a[j]] = b[i] + 1;
        if(a[j] % 2 == 1 && i + a[j] < N
        && c[i + a[j]] > c[i] + 1)c[i + a[j]] = c[i] + 1;
      }
    }

    for(;;){
      n = sc.nextInt();
      if(n == 0)break;
      out.println(b[n - 1] + " " + c[n - 1]);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}