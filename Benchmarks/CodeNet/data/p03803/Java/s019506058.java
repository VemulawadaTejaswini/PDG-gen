import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (A == B) {
            System.out.println("Draw");
        } else if (B != 1 && (A == 1 || A > B)) {
            System.out.println("Alice");
        } else {
            System.out.println("Bob");
        }
    }
}
