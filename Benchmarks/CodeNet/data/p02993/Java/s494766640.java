import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char prev = 's';

        for (char c : s.toCharArray()) {

            if (prev == c) {
                System.out.println("Bad");
                return;
            }
            prev = c;
        }
        System.out.println("Good");
    }
}
