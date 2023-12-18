import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number_n, i, j, min_temp = Integer.MAX_VALUE, temp = -1, temp_count = 0, max_count = 0;
    number_n = Integer.parseInt(sc.next());
    int[] number = new int[number_n];
    for (i = 0; i < number_n; i++) number[i] = Integer.parseInt(sc.next());
    for (i = 0; i < number_n; i++) {
      for(j = temp; j < number_n; j++) {
        if(j == temp) temp = -1;
        if(min_temp >= number[j]) {
          temp_count++;
          min_temp = number[j];
        } else if(temp == -1) {
          temp = i;
        }
      }
      if(temp == -1) break;
      if(max_count < temp_count) max_count = temp_count;
      temp_count = 0;
      min_temp = Integer.MAX_VALUE;
    }
    System.out.println(max_count);
  }
}
