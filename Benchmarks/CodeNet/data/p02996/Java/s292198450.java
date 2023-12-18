import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number_n, i, j, temp, flag = 0, current = 0;
    number_n = Integer.parseInt(sc.next());
    int[] time = new int[number_n];
    int[] goal = new int[number_n];
    for(i = 0; i < number_n; i++) {
      time[i] = Integer.parseInt(sc.next());
      goal[i] = Integer.parseInt(sc.next());
    }
    for(i = 0; i < number_n - 1; i++) {
      for(j = number_n - 1; j > i; j--) {
        if(goal[j] < goal[j-1]) {
          temp = goal[j];
          goal[j] = goal[j-1];
          goal[j-1] = temp;

          temp = time[j];
          time[j] = time[j-1];
          time[j-1] = temp;
        }
      }
    }
    for(i = 0; i < number_n; i++) {
      current += time[i];
      if(current > goal[i]) {
        System.out.println("No");
        flag++;
        break;
      }
    }
    if(flag == 0) System.out.println("Yes");
  }
}
