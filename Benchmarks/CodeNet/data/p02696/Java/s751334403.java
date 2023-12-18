import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a =  sc.nextLong();
    long b =  sc.nextLong();
    long n =  sc.nextLong();
    long x = n;
    if(n>=b-1)x = b-1;
    System.out.println((a*(x%b)-(a*x)%b)/b);
  }
}