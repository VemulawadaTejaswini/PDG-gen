import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String T = sc.next();
        String reverseT = new StringBuilder(T).reverse().toString();

        // dream dreamer erase eraser
        String[] words = new String[] {
                "maerd",
                "remaerd",
                "esare",
                "resare",
        };

        while (true) {
            boolean notFound = true;
            for (int i = 0; i < words.length; i++) {
                if (reverseT.startsWith(words[i])) {
                    notFound = false;
                    reverseT = reverseT.replaceFirst(words[i], "");
                }
            }
            if (notFound) {
                break;
            }
        }
        if (reverseT.length() != 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}