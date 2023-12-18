import java.util.Scanner;

class Main {
  static public void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int gcd = gcd(A, B);
    int counter = 1;
    for(int i = 2; i <= Math.sqrt(gcd); i++) {
      if(gcd % i == 0) {
        counter++;
      }
      while(gcd % i == 0) {
        gcd /= i;
      }
    }
    if (gcd > 1) {
      counter++;
    }
    System.out.println(counter);
    return;
  }

  private static int gcd(int m, int n) {

    if(n == 0) {
      return m;
    }
    return gcd(n, m % n);
  }
}
