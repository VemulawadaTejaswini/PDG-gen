public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, i;

    for(;;){
      n = sc.nextInt();
      if(n == 1)break;
      out.print(n + ":");
      for(i = 6;i <= n;i++){
        if(n % i == 0 && ismsprime(i))out.print(" " + i);
      }
      out.println();
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }

  private static boolean ismsprime(int p){
    int i;
    if((p % 7 != 1 && p % 7 != 6) || p == 1)return false;
    for(i = 6;i * i <= p;i+=5){
      if(p % i == 0)return false; i += 2;
      if(p % i == 0)return false;
    }
    return true;
  }
}