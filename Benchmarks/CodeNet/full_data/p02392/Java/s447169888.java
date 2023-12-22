import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int[] array = { a, b, c };

        boolean inputOK = false;

        for (int i : array) {
            if (0 <= i && i <= 100) {
                inputOK = true;
            }
        }

        if (inputOK) {
            if (a < b && a < c) {
                System.out.println(b < c ? "YES" : "NO");
            } else if (a < c && b < c) {
                System.out.println(a < b ? "YES" : "NO");
            } else {
                System.out.println("NO");
            }
        }

    }
}

