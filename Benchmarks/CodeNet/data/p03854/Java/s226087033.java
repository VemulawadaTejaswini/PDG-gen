import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String text = sc.next();
    for (int i = 0; i < 2000; i++) {
   	  int textLength = text.length();
      if (text.lastIndexOf("dream") == textLength - 5) {
        text = text.substring(0, textLength - 5);
      } else if (text.lastIndexOf("dreamer") == textLength - 7) {
        text = text.substring(0, textLength - 7);
      } else if (text.lastIndexOf("erase") == textLength -5) {
        text = text.substring(0, textLength - 5);
      } else if (text.lastIndexOf("eraser") == textLength - 6) {
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