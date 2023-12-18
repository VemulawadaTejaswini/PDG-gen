import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      if(s.length() % 2 == 0) {
        System.out.println("No");
        return;
      }

      if(isPalindrom(s) && isPalindrom(s.substring(0, s.length() / 2)) && isPalindrom(s.substring(s.length() / 2 + 1)))
        System.out.println("Yes");
      else
        System.out.println("No");
  }

  private static boolean isPalindrom(String s) {
    int left = 0; 
    int right = s.length() - 1;
    while(left < right) {
      if(s.charAt(left) != s.charAt(right))
        return false;
      left++;
      right--;
    }
    return true;
  }
}