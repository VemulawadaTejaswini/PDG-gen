import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int A = in.nextInt();
            int B = in.nextInt();

            System.out.println(Math.max(A, B) + " " + Math.max(0, A + B - N));
        }
    }
}
