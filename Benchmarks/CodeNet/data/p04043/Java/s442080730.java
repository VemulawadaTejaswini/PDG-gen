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
        int C = sc.nextInt();
        if (A == 5 && B == 5 && C == 7 || A == 5 && B == 7 && C == 5 || A == 7 && B == 5 && C == 5) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
