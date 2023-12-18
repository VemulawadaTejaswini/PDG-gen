import java.util.*;

public class Main {
    public static void main(String[] args) {
        final List<String> wordPoolReversed = Arrays.asList("maerd", "remaerd", "esare", "resare");
        try(Scanner sc = new Scanner(System.in);) {
            StringBuilder srcReversedStringBuilder = new StringBuilder().append(sc.nextLine());
            String srcReversed = srcReversedStringBuilder.reverse().toString();
            boolean canCompose = true;
            for (int i = 0; i < srcReversed.length() - 2; i++) {
                boolean canDevide = false;
                for (String word : wordPoolReversed) {
                    if (word.equals(srcReversed.substring(i, word.length()))) {
                        canDevide = true;
                        i += word.length();
                    } 
                }
                if (!canDevide) {
                    canCompose = false;
                    break;
                }
            }
            System.out.println(canCompose ? "YES" : "NO");
        }
    }
}