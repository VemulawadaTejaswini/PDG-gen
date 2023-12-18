import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int digit_sum; // 各桁の和
    int sum = 0;
    String strN;
    int len; // 桁の長さ

    for(int i = 1; i <= N; i++) {
      strN = String.valueOf(i);
      char[] cN = strN.toCharArray();
      len = cN.length;
      digit_sum = 0;
      for(int j = 0; j < len; j++) {
        int d = Character.getNumericValue(cN[j]);
        digit_sum += d;
      }
      if(digit_sum >= a && digit_sum <= b) {
        sum += i;
      }
    }

    System.out.println(sum);
  }
}
