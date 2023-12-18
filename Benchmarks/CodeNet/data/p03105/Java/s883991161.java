import java.util.Scanner;

class Problem {
    private int A;
    private int B;
    private int C;

    Problem() {
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
    }

    int solve() {
        return Math.min(B / A, C);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Problem().solve());
    }
}
