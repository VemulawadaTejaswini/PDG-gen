import java.util.Scanner;
import java.util.HashMap;
public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    StringBuilder lines = new StringBuilder();
    String line;
    while (s.hasNextLine()) {
        line = s.nextLine();
        if (line.isEmpty())
            break;
        lines.append(line);
    }
    s.close();
    String sent = lines.toString();
    sent = sent.toLowerCase();
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    for (char i = 'a'; i <= 'z'; i++) {
      map.put(i, 0);
    }
    for (int i = 0; i < sent.length(); i++) {
      Character c = sent.charAt(i);
      if (Character.isLetter(c)) {
        int prev = map.get(c);
        map.put(c, prev+1);
      }
    }
    for (char i = 'a'; i <= 'z'; i++) {
      int count = map.get(i);
      System.out.println(i + " : " + count);
    }
  }
}

