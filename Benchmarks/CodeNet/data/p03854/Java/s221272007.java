import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String text = sc.next();
    String[] dayDream = {"dream", "dreamer", "erase", "eraser"};
    for (int i = 0; i < 20000; i++) {
   	  int textLength = text.length();
      if (text.lastIndexOf(dayDream[0]) == textLength - 5) {
        text = text.substring(0, textLength - 5);
      } else if (text.lastIndexOf(dayDream[1]) == textLength - 7) {
        text = text.substring(0, textLength - 7);
      } else if (text.lastIndexOf(dayDream[2]) == textLength -5) {
        text = text.substring(0, textLength - 5);
      } else if (text.lastIndexOf(dayDream[3]) == textLength - 6) {
        text = text.substring(0, textLength - 6);
      } else if (text.isEmpty()) {
        System.out.println("YES");
        break;
      } else {
        System.out.println("NO");
        break;
       }
    }
  }
}