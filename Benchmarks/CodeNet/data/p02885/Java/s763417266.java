import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        int A, B;

        try (Scanner sc = new Scanner(System.in)) {
            A = sc.nextInt();
            B = sc.nextInt();

        }

        if (A < B * 2) {
            System.out.println(0);

        } else {
            System.out.println(A - B * 2);
        }
    }

}
