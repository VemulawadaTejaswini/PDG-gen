public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n;

    for(;;){
      n = sc.nextInt();
      if(n == 0)break;
      for(;;n--)
        if(isprime(n) && isprime(n - 2) && isprime(n - 6) && isprime(n - 8)){
          out.println(n); break;
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
    for(i = 2;i * i <= p;i++)if(p % i == 0)return false;
    return true;
  }
}