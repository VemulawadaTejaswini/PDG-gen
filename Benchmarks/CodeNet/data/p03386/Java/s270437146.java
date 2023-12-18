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

        for (int i = A; i <= Math.min(A + K - 1, B); i++) {
            System.out.println(i);
        }

        for (int i = Math.max(B - K + 1, A + K - 1); i <= B; i++) {
            System.out.println(i);
        }

        return;
    }

}