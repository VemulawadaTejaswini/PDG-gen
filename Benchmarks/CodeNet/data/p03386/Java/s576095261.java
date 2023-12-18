import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();

        if (A + K - 1 < B - K + 1) {
            for (int i = A; i <= A + K - 1; i++) {
                System.out.println(i);
            }

            for (int i = B - K + 1; i <= B; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = A; i <= B; i++) {
                System.out.println(i);
            }
        }

        return;
    }

}