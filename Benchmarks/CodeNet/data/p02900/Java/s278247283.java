import java.util.Scanner;

class Main {
  static public void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    long A = sc.nextInt();
    long B = sc.nextInt();
    long gcd = gcd(A, B);
    int counter = 0;

    for(int i = 0; i < Math.max(A, B); i++) {
      if(gcd % i == 0) {
        counter++;
      }
      while(gcd % i == 0) {
        gcd /= i;
      }
    }
    System.out.println(gcd);
  }





  private static long gcd(long m, long n) {
    if(m < n) {
      return gcd(n, m);
    }
    if(n == 0) {
      return m;
    }
    return gcd(n, m % n);
  }
}
