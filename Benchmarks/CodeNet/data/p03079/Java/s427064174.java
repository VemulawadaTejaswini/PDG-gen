import java.util.Scanner;

class Problem {
    private int A, B, C;
    Problem() {
        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
    }

    String solve() {
        return A == B && B == C && C == A ? "Yes" : "No";
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Problem().solve());
    }
}
