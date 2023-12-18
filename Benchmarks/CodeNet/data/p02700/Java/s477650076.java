
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int a = sc.nextInt();
    static int b = sc.nextInt();
    static int c = sc.nextInt();
    static int d = sc.nextInt();

    public static void main(String[] args) {
        int x = a / d;
        int y = c / b;
        if (x > y) {
            System.out.println("No");
            return;
        } else if (x == y && b >= d) {
            System.out.println("Yes");
            return;
        } else {
            System.out.println("No");
            return;
        }

        }
    }

