public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int a, d, n;
    int count;

    for(;;){
      a = sc.nextInt();
      d = sc.nextInt();
      n = sc.nextInt();
      if(a == 0 && d == 0 && n == 0)break;
      count = 0;

      for(;;a+=d)if(isprime(a) && ++count == n){
          out.println(a); break;
      }
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
  private static boolean isprime(int p){
    int i;
    if(p == 1)return false;
    else for(i = 2;i * i <= p;i++)if(p % i == 0)return false;
    return true;
  }
}