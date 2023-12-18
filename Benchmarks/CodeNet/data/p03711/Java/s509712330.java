import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int[] group = {0, 2, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0};
        if (group[sc.nextInt() - 1] == group[sc.nextInt() - 1]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
