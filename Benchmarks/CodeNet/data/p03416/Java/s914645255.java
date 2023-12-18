import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int count = 0;
    for (int num = a; num <= b; num++) {
      if (isPalindromicNumbers(num)) count++;
    }
    System.out.println(count);
  }
  public static boolean isPalindromicNumbers(int num) {
    String strNum = Integer.toString(num);
    for (int i = 0; i < strNum.length() / 2; i++) {
      if (strNum.charAt(i) != strNum.charAt(strNum.length() - i - 1)) return false;
    }
    return true;
  }
}