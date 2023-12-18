import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int start = A > C ? A : C;
        int end = B < D ? B : D;
        System.out.println(end - start > 0 ? end - start : 0);
    }
}
