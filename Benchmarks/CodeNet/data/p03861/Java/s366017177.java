import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    long a = scanner.nextLong();
    long b = scanner.nextLong();
    long x = scanner.nextLong();
    
    long count = b / x;
    
    if(a == 0L) {
      count++;
    } else {
      count -= (a - 1L) / x;
    }
    
    System.out.println(count);
  }
}