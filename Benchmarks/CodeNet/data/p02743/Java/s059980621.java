
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long a = scanner.nextLong();
    long b = scanner.nextLong();
    long c = scanner.nextLong();
    
    if ((c - a - b) * (c - a - b) <= 4 * a * b || c-a-b < 0){
      System.out.println("No");
    } else{
      System.out.println("Yes");
    }

  }
}
