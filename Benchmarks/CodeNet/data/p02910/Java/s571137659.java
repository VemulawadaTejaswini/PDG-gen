import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        boolean result = true;
        for (int i = 0; i < s.length() - 1 && result; i++) {
            if (i % 2 == 0) {
                result = "R".equals(String.valueOf(s.charAt(i)))
                        || "U".equals(String.valueOf(s.charAt(i)))
                        || "D".equals(String.valueOf(s.charAt(i)));
            } else {
                result = "L".equals(String.valueOf(s.charAt(i)))
                        || "U".equals(String.valueOf(s.charAt(i)))
                        || "D".equals(String.valueOf(s.charAt(i)));
            }
        }

        System.out.println(result ? "Yes" : "No");
    }
}
