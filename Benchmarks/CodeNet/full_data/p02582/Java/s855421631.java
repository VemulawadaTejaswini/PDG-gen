import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            String s = scanner.next();
            int counter = 0;
            int result = 0;

            for (int i = 0; i < 3; i++) {
                char next = s.charAt(i);
                if (next == 'R') {
                    counter++;
                } else {
                    counter = 0;
                }
                result = Math.max(result, counter);
            }
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
