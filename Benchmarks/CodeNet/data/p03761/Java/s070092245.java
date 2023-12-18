import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    Map<Character, Integer>[] freqs = new Map[n];
    for (int i = 0; i < n; i++) {
      freqs[i] = new HashMap<>();
      for (char ch : scanner.next().toCharArray()) freqs[i].put(ch, freqs[i].getOrDefault(ch, 0) + 1);
    }

    List<Character> ans = new ArrayList<>();
    for (char ch = 'a'; ch <= 'z'; ch++) {
      int min = 51;
      for (int i = 0; i < n; i++) min = Math.min(min, freqs[i].getOrDefault(ch, 0));
      if (min < 51) for (int i = 0; i < min; i++) ans.add(ch);
    }

    char[] chars = new char[ans.size()];
    for (int i = 0; i < ans.size(); i++) chars[i] = ans.get(i);
    System.out.println(new String(chars));
  }
}
