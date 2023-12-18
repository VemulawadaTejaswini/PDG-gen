import java.util.*;

public class Main {
  public static boolean check(int num) {
    int i;
    for(i = 1; i * i <= num; i++) {
      if(i * i == num) return true;
    }
    return false;
  }

  public static void main(String[] args) {
    int i, j, number_l, number_r, temp, flag_a = 0, flag_b = 0, ans = 2019;
    Scanner sc = new Scanner(System.in);
    number_l = Integer.parseInt(sc.next());
    number_r = Integer.parseInt(sc.next());
    if(number_l % 2019 == 0) {
      ans = 0;
    } else {
      for(i = number_l; i <= number_r; i++) {
        if(i % 2019 == 0) {
          ans = 0;
          break;
        } else if(i % 673 == 0) {
          flag_a = 1;
        } else if(i % 3 == 0) {
          flag_b = 1;
        }
        if(flag_a == 1 && flag_b == 1) {
          ans = 0;
          break;
        } else {
          for(j = i + 1; j <= number_r; j++) {
            if(ans > ((i * j) % 2019)) {
              ans = (i * j) % 2019;
            }
          }
        }
      }
    }
    System.out.println(ans);
  }
}
