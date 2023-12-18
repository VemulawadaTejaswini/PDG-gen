import java.util.Scanner;

class Problem {
    private int A;
    private int B;

    Problem() {
        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();
        B = sc.nextInt();
    }

    int solve() {
        if (B % A == 0) {
            return A + B;
        } else {
            return B - A;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Problem().solve());
    }
}
