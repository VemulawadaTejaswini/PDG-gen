import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long number, sum = 0;
    number = Long.parseInt(sc.next());
    sum = number * (number - 1) / 2;
    System.out.println(sum);
  }
}
