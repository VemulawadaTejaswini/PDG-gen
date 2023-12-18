import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int avg =  (a+b) / 2;
    avg = ((a+b) % 2 != 0) ? avg + 1 : avg;
    System.out.println(avg);
  }
}
