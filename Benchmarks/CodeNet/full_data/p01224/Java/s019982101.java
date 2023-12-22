public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, i, s;
    for(;;){
      n = sc.nextInt(); if(n == 0)break;
      s = 1;
      for(i = 2;i * i <= n;i++)if(n % i == 0)s += i + n / i;
      if(--i * i == n)s -= i;
      if(s < n)out.println("deficient number");
      else if(s > n)out.println("abundant number");
      else out.println("perfect number");
    }
    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}