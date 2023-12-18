import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String s = scanner.next();
            byte[] bytes = s.getBytes();
            if (bytes[0] == bytes[1] || bytes[1] == bytes[2] || bytes[2] == bytes[3]) {
                System.out.println("Bad");
            } else {
                System.out.println("Good");
            }
        }
    }

}
