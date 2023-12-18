import java.util.*;

public class Main {
    public static void main(String[] args) {
        final List<String> wordList = Arrays.asList("dream", "dreamer", "erase", "eraser");
        try(Scanner sc = new Scanner(System.in);) {
            String src = sc.nextLine();
            wordList.forEach(word -> {
                src.replaceAll(word, "");
            });
            System.out.println(src.length() == 0 ? "YES" : "NO");
        }
    }
}