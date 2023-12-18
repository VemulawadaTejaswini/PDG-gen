import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = Long.parseLong(sc.next());
        long M = Long.parseLong(sc.next());

        if (N == 1 && M == 1) {
            System.out.println(1);
        } else if (N == 1) {
            System.out.println(M - 2);
        } else if (M == 1) {
            System.out.println(N - 2);
        } else {
            System.out.println(N*M - 2*(N+M) + 4);
        }
    }
}