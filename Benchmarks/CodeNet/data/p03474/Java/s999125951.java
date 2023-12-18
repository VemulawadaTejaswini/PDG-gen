import java.util.*;

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
        char[] S = sc.next().toCharArray();

        for (int i = 0; i < A; i++) {
            char ch = S[i];
            if (!(ch >= '0' && ch <= '9')) {
                System.out.println("No");
                return;
            }
        }

        if (S[A] != '-') {
            System.out.println("No");
            return;
        }

        for (int i = A + 1; i < A + B + 1; i++) {
            char ch = S[i];
            if (!(ch >= '0' && ch <= '9')) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
        return;
    }

}