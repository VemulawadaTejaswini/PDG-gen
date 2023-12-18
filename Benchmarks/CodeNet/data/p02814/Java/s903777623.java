import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    long M = scan.nextLong();
    long[] a = new long[N];
    for(int i=0; i<N; i++) {
      a[i] = scan.nextLong();
    }
    scan.close();

    long[] ah = new long[N];
    for(int i=0; i<N; i++) {
      ah[i] = a[i] / 2;
    }

    long lcm = 1;
    for(int i=0; i<N; i++) {
      long gcdresult = gcd(lcm, ah[i]);
      lcm = lcm * ah[i] / gcdresult;
      if((lcm / ah[i]) % 2 == 0) {
        System.out.println(0);
        return;
      }
    }

    System.out.println((M+lcm) / (2*lcm));
  }

  public static long gcd(long x, long y) {
    while(x%y != 0) {
      long temp = x;
      x = y;
      y = temp % y;
    }
    return y;
  }
}