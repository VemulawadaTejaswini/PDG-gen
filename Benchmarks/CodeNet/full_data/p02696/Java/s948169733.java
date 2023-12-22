import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a =  sc.nextLong();
    long b =  sc.nextLong();
    long n =  sc.nextLong();

    System.out.println(n>=b-1?b-1:n);
  }
}