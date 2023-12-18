import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            final int A = sc.nextInt();
            if (A % 2 == 0 && (A % 3 != 0 && A % 5 != 0)) {
                System.out.println("DENIED");
                return;
            }
        }
        System.out.println("APPROVED");
    }
}
