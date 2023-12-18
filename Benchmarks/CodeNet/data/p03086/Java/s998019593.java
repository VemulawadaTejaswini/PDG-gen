import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int count = 0;
    int maxCount = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'A') {
        count++;
      } else if (s.charAt(i) == 'C') {
        count++;
      } else if (s.charAt(i) == 'G') {
        count++;
      } else if (s.charAt(i) == 'T') {
        count++;
      } else {
        maxCount = Math.max(maxCount,count);
        count = 0;
      }
    }
    System.out.println(maxCount);
  }
}
