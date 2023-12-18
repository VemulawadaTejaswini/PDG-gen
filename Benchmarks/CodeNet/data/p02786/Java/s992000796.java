import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    System.out.println(solve(n));
    sc.close();
  }
  
  public static long solve(long h) {
    if(h == 1) return 1;
    return 2*solve(h/2)+1;
  }
}