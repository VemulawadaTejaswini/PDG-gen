import java.util.*;

class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    long n = scan.nextLong(), x = scan.nextLong();

    System.out.println(n+calc(x,n-x));
  }

  static long calc(long a,long b) {
    if(b%a==0) {
      return b*2L-a;
    }else {
      return (b/a)*a*2L+calc(b%a,a);
    }
  }
}
