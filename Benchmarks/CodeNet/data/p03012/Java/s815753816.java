import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number_n, i, answer;
    int sum = 0;
    int temp_a = 0;
    int temp_b = 0;
    number_n = Integer.parseInt(sc.next());
    int[] weight = new int[number_n];
    for(i = 0; i < number_n; i++) {
      weight[i] = Integer.parseInt(sc.next());
      sum += weight[i];
    }
    for(i = 0; i < number_n; i++) {
      temp_a += weight[i];
      if(sum <= 2 * temp_a) {
        break;
      } else {
        temp_b = temp_a;
      }
    }
    temp_a = sum - 2 * temp_a;
    temp_b = sum - 2 * temp_b;
    temp_a = Math.abs(temp_a);
    temp_b = Math.abs(temp_b);
    if(temp_b < temp_a) {
      answer = temp_b;
    } else {
      answer = temp_a;
    }
    System.out.println(answer);
  }
}
