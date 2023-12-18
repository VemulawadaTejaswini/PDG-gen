import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            String nums = scanner.next();
            int count = 0;
            for (int i = 0; i < nums.length(); i++) {
                if (nums.charAt(i) == '1') {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
