import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        int N = scanner.nextInt();
        if (N / 100 == N % 10) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}