import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number_input = Integer.parseInt(sc.next());
    int number_upper = number_input / 100;
    int number_lower = number_input % 100;
    if(number_upper <= 12 && number_lower <= 12) {
      System.out.println("AMBIGUOUS");
    } else if(number_upper <= 12) {
      System.out.println("MMYY");
    } else if(number_lower <= 12) {
      System.out.println("YYMM");
    } else {
      System.out.println("NA");
    }
  }
}
