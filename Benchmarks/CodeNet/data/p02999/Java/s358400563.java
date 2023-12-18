import java.util.*;

public class Main {
  public static void main(String[] args) {
    int i, number_n, number_a;
    Scanner sc = new Scanner(System.in);
    number_n = Integer.parseInt(sc.next());
    number_a = Integer.parseInt(sc.next());
    if(number_n < number_a) System.out.println(0);
    else System.out.println(10);
  }
}
