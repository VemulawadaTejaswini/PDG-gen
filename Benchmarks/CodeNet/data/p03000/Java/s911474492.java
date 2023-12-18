import java.util.*;

public class Main {
  public static void main(String[] args) {
    int i, number_n, number_x, current_point = 0, count = 1;
    Scanner sc = new Scanner(System.in);
    number_n = Integer.parseInt(sc.next());
    number_x = Integer.parseInt(sc.next());
    int[] length = new int[number_n];
    for(i = 0; i < number_n; i++) {
      length[i] = Integer.parseInt(sc.next());
      current_point += length[i];
      if(current_point <= number_x) count++;
      else break;
    }
    System.out.println(count);
  }
}
