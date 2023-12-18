import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long count = 0;
    long a = sc.nextLong();
    long b = sc.nextLong();
    long x = sc.nextLong();
    for(long i = a; i <= b; i++) {
      if(i % x == 0)count++;
    }
    System.out.println(count);
  }
}
