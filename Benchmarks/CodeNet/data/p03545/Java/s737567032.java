import java.util.*;

class Main {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    char s[] = sc.next().toCharArray();

    for (int i = 0; i < (1 << s.length - 1); i++) {
      String ans = "" + s[0];
      int sum = s[0] - '0';
      for (int j = 0; j < s.length-1; j++) {
        if ((1 & i>>j) == 1) {
          sum += s[j+1] - '0';
          ans += "+" + s[j+1];
        }
        else {
          sum -= s[j+1] - '0';
          ans += "-" + s[j+1];
        }
      }
      //System.out.printf("%s=%d\n", ans, sum);
      if (sum == 7) {
        System.out.println(ans + "=7");
        return;
      }
    }
    //System.out.println("No Answer");
  }
}
