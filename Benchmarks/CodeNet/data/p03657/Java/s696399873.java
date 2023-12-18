import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int A = in.nextInt();
            int B = in.nextInt();
            System.out.println((A % 3 == 0 || B % 3 == 0 || (A + B) % 3 == 0) ? "Possible" : "Impossible");
        }
    }
}
