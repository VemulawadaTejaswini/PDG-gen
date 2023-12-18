import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    long sum = 0;
    int i, j, len = str.length();
    for(i = 0; i < 1<<(len - 1); i++) {
      String firstChar = String.valueOf(str.charAt(0));
      StringBuilder sb = new StringBuilder(firstChar);
      for(j = 0; j < len - 1; j++) {
        if((1 & i >> j) == 1) sb.append("+");
        sb.append(str.charAt(j + 1));
      }
      String[] subsets = sb.toString().split("\\+");
      for(String tempStr : subsets) {
        sum += Long.parseLong(tempStr);
      }
    }
    System.out.println(sum);
  }
}
