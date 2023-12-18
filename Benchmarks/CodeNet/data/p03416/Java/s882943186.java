import java.util.Scanner;

public class Main {

  static Scanner sc = new Scanner(System.in);
  static int a;
  static int b;


  public static void main(String[] args) {
    a = sc.nextInt();
    b = sc.nextInt();
    int answer = output(a, b);
    System.out.println(answer);
  }

  private static int output(int a, int b) {
    int answer = 0;
    for (int i = a; i <= b; i++) {
      String num = String.valueOf(i);
      if (check(num)) {
        answer++;
      }
    }
    return answer;
  }

  private static boolean check(String num) {
    int length = num.length();
    for (int i = 0; i < length / 2; i++) {
      String s = num.substring(i, i + 1);
      String s2 = num.substring(length - i - 1, length - i);
      if (!s.equals(s2)) {
        return false;
      }
    }
    return true;
  }
}
