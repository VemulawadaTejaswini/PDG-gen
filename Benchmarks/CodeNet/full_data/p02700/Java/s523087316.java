import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next()); // HP
        int b = Integer.parseInt(scanner.next()); //こうげき
        int c = Integer.parseInt(scanner.next()); //HP
        int d = Integer.parseInt(scanner.next()); //こうげき
        while (a >= 0 || c >= 0) {
            c -= b;
            if (c <= 0) {
                break;
            }
            a -= d;
            if (a <= 0) {
                break;
            }
        }
        if (a <= 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}