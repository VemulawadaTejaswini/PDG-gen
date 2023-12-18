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
    int i, number_l, number_r, temp, ans = 2019;
    Scanner sc = new Scanner(System.in);
    number_l = Integer.parseInt(sc.next());
    number_r = Integer.parseInt(sc.next());
    temp = number_l;
    for(i = number_l + 1; i <= number_r; i++) {
      if(ans > (temp * i) % 2019) {
        ans = (temp * i) % 2019;
      }
      if(i % 2019 == 0) {
        ans = 0;
        break;
      } else if(i % 673 == 0) {
        temp = 673;
      } else if(i % 3 == 0) {
        temp = 3;
      }
    }
    System.out.println(ans);
  }
}
