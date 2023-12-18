import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int[] a = { 1, 2, 3 };

        sc.close();

        if (x == 2) {
            x = 3;
        } else if (x == 4 || x == 6 || x == 9 || x == 11) {
            x = 2;
        } else {
            x = 1;
        }

        if (y == 2) {
            y = 3;
        } else if (y == 4 || y == 6 || y == 9 || y == 11) {
            y = 2;
        } else {
            y = 1;
        }

        if (x == y) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}