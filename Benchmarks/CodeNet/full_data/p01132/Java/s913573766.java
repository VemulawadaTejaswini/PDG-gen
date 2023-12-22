public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int[] a, b, c;
    int i, x, sum, f, d;

    a = new int[4]; b = new int[4]; c = new int[4];
    c[0] = 10; c[1] = 50; c[2] = 100; c[3] = 500;
    f = 0;
    for(;;){
      x = sc.nextInt(); if(x == 0)break;
      sum = -x;
      if(f++ > 0)out.println();
      for(i = 0;i < 4;i++){
        a[i] = sc.nextInt(); b[i] = 0; sum += a[i] * c[i];
      }
      for(i = 4;i-- > 0;){
        d = sum / c[i];
        b[i] += d;
        sum -= d * c[i];
      }

      for(i = 0;i < 4;i++)if(a[i] - b[i] > 0)
        out.println(c[i] + " " + (a[i] - b[i]));
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}