public class Main{
  static int count;
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int a, b, tmp;

    for(;;){
      a = sc.nextInt(); b = sc.nextInt();
      if(a == 0 && b == 0)break;
      if(a < b){
        tmp = a; a = b; b = tmp;
      }
      count = 0;
      out.println(gcd(a, b) + " " + count);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }

  private static int gcd(int x, int y){
    count++;
    if(x % y == 0)return y;
    else return gcd(y, x % y);
  }
}