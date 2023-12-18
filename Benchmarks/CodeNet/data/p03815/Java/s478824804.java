import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    long x = sc.nextLong();

    sc.close();

    long count = x / 11 * 2;

    long mod = x % 11;

    if (0 < mod && mod <= 6) {
      count++;
    } else {
      count += 2;
    }

    System.out.println(count);
    
  }

}