public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, x, o, y, r, q, a, d;

    n = sc.nextInt(); x = 0; q = 1; r = 0;
    for(;n-- > 0;){
      o = sc.nextInt(); y = sc.nextInt();
      if(o == 1)x += y;
      else if(o == 2)x -= y;
      else if(o == 3){
        x *= y;
        r *= y; x += r / q; r %= q;
        if(r == 0)q = 1;
        else{
          d = gcd(r, q); r /= d; q /= d;
        }
      }else{
        q *= y;
        d = gcd(r, q); r /= d; q /= d;
        a = x % y; x /= y;
        r = r * y + a * q; q *= y;
        if(r % q == 0){
          x += r / q; r = 0; q = 1;
        }else{
          d = gcd(r, q); r /= d; q /= d;
          x += r / q; r %= q;
        }
      }
    }
    if(r == 0)out.println(x);
    else out.println((x * q + r) + " " + q);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
  private static int gcd(int a, int b){
    if(a % b == 0)return b;
    else return gcd(b, (a % b));
  }
}