import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    HashSet<String> words = new HashSet<>();
    String lastWord = scanner.next();
    words.add(lastWord);
    for (int i = 1; i < N; ++i) {
      String word = scanner.next();
      if (word.charAt(0) != lastWord.charAt(lastWord.length() - 1)) {
        System.out.println("No");
        return;
      }
      if (words.contains(word)) {
        System.out.println("No");
        return;
      }
      lastWord = word;
      words.add(word);
    }
    System.out.println("Yes");
    return;
  }
}