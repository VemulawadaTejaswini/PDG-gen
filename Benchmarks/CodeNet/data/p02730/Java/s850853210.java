import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] s = scanner.next().toCharArray();
    if (palindrome(s, 0, s.length) && palindrome(s, 0, s.length / 2) && palindrome(s, s.length / 2 + 1, s.length)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }

  private static boolean palindrome(char[] s, int left, int right) {
    right--;
    while (left < right) {
      if (s[left] != s[right]) return false;
      left++;
      right--;
    }
    return true;
  }
}
