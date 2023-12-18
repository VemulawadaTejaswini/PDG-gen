import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = 0;
        int min = 1000;
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            max = Math.max(max, a);
            min = Math.min(min, a);
        }
        System.out.println(max - min);
    }
}
