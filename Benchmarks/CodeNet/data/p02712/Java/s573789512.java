import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    sc.close();

    long p = 1;
    long sum = 0;
    for (int i = 0; i <= n; i++) {
      if (n%5 == 0 || n%3 == 0) {
      } else {
        sum += p;
      }
      p++;
    }
    System.out.println(sum);
  }
}