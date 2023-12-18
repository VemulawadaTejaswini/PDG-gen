import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());

        if (N % 2 == 0) {
            System.out.println(0.5f);
        } else {
            System.out.println((N + 1f) / (2 * N));
        }
    }
}