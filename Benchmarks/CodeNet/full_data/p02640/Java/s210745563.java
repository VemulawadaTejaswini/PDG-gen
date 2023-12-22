import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a < b && a * 4 - 2 >= b && a % 2 == 0 && b % 14 == 0 || b % 12 == 0 || b % 10 == 0 || b % 8 == 0) {
            System.out.println("Yes");
        } else if (a < b && a * 4 - 2 >= b && a % 2 == 1 && b % 14 == 0 || b % 12 == 0 || b % 10 == 0 || b % 8 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}