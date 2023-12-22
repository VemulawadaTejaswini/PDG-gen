public class Main{
  public void run(java.io.InputStream in,java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);

    int r, n, i, j, xl, xr, h;
    int[] maxh;
    double t, mint;

    for(;;){
      r = sc.nextInt(); n = sc.nextInt();
      if(r == 0 && n == 0)break;

      maxh = new int[40];   //maxh[i] [i - 20, i - 19]
      for(i = 0;i < 40;i++)maxh[i] = 0;

      for(i = 0;i < n;i++){
        xl = sc.nextInt(); xr = sc.nextInt(); h = sc.nextInt();
        for(j = xl;j < xr;j++){   //silhouette
          if(maxh[j + 20] < h)maxh[j + 20] = h;
        }
      }

      mint = 21;
      for(i = 0;i < r;i++){
        t = (double)maxh[19 + i] + (double)r - Math.sqrt(r * r - i * i);
        if(mint > t)mint = t;
        t = (double)maxh[20 + i] + (double)r - Math.sqrt(r * r - i * i);
        if(mint > t)mint = t;
        t = (double)maxh[19 - i] + (double)r - Math.sqrt(r * r - i * i);
        if(mint > t)mint = t;
        t = (double)maxh[20 - i] + (double)r - Math.sqrt(r * r - i * i);
        if(mint > t)mint = t;
      }
      out.println(mint);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in,System.out);
  }
}