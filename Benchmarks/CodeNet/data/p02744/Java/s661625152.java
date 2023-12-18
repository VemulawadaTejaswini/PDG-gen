import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = "a b c d e f g h i j k l m n o p q r s t u v w x y z".split(" ");
        int n = scanner.nextInt();
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i == 0) continue;
            a.append("a");
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a.toString() + s[i]);
        }
    }
}