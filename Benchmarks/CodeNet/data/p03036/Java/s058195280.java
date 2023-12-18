import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i, number_r, number_d, current_number;
    number_r = Integer.parseInt(sc.next());
    number_d = Integer.parseInt(sc.next());
    current_number = Integer.parseInt(sc.next());
    for(i = 0; i < 10; i++) {
      current_number = current_number * number_r - number_d;
      System.out.println(current_number);
    }
  }
}
