import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        if (N == 2) {
            System.out.println("Draw");
        } else {
            if (Math.abs(A - B) % 2 == 0) {
                System.out.println("Alice");
            } else {
                System.out.println("Borys");
            }
        }
    }
}