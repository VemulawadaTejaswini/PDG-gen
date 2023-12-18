import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int upLimit = sc.nextInt();
    int ans = 0;
    for (int i = 357; i <= upLimit; i++) {
      boolean is7 = false;
      boolean is5 = false;
      boolean is3 = false;
      boolean others = true;
      String str = new String().valueOf(i);
      for (int j = 0; j < str.length(); j++) {
        if (str.charAt(j) == '7') {
          is7 = true;
        } else if (str.charAt(j) == '5') {
          is5 = true;
        } else if (str.charAt(j) == '3') {
          is3 = true;
        } else {
          others = false;
        }
      }
      if (is7 && is5 && is3 && others) {
        ans++;
      }
    }
    System.out.println(ans);
  }

}
