import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] firstInput = sc.nextLine().split("[\\s]+");
    long N = Integer.parseInt(firstInput[0]);
    if(N % 2 == 0) {
      System.out.println(N);
    } else {
      System.out.println(N * 2);
    }
  }
}
