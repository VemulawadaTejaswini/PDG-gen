import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number_n, i, j, min_temp = Integer.MAX_VALUE, temp = 0, temp_count = 0, max_count = 0;
    number_n = Integer.parseInt(sc.next());
    int[] number = new int[number_n];
    for (i = 0; i < number_n; i++) number[i] = Integer.parseInt(sc.next());
    do {
      for (i = temp; i < number_n; i++) {
        if(i == temp) temp = 0;
        if(min_temp >= number[i]) {
          temp_count++;
          min_temp = number[i];
        } else if(temp == 0) {
          temp = i;
        }
      }
      if(max_count < temp_count) max_count = temp_count;
      temp_count = 0;
      min_temp = Integer.MAX_VALUE;
    } while(temp != 0);

    System.out.println(max_count);
  }
}
