import java.util.*;

public class Main {
  public static boolean isInteger(String s) {
    try {
      int i = Integer.parseInt(s);
      return true;
    } catch(NumberFormatException e) {
      return false;
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean first = false;
    String word = "";
    while(true) {
      String s = sc.nextLine();
      if(s.equals("_")) {
        System.out.println(word);
        break;
      } else if(!isInteger(s)) {
        if(first) {
          System.out.println(word);
        }
        word = s;
        if(!first) {
          first = true;

        }
      } else {
        int h = Integer.parseInt(s);
        word = word.substring(h) + word.substring(0, h);
      }
    }
  }
}

