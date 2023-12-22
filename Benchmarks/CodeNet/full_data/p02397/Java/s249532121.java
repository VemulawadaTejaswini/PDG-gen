import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i, number_left, number_right;
    for(i = 0; ; i++) {
      number_left = Integer.parseInt(sc.next());
      number_right = Integer.parseInt(sc.next());
      if(number_left == 0 && number_right == 0) break;
      if(number_right < number_left) {
        int temp = number_right;
        number_right = number_left;
        number_left = temp;
      }
      System.out.println(number_left + " " + number_right);
    }
  }
}

