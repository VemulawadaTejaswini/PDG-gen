import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String A = in.next();
            String B = in.next();

            int compare = compare(A, B);
            System.out.println(compare == 0 ? "EQUAL" : compare > 0 ? "GREATER" : "LESS");
        }
    }

    private static int compare(String a, String b) {
        if (a.length() < b.length()) {
            return -1;
        }
        if (a.length() > b.length()) {
            return 1;
        }
        int N = a.length();
        for (int i = 0; i < N; i++) {
            if (a.charAt(i) < b.charAt(i)) {
                return -1;
            }
            if (a.charAt(i) > b.charAt(i)) {
                return 1;
            }
        }
        return 0;
    }
}
