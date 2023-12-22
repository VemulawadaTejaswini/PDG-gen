import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("[\\s]+");
        int n = sc.nextInt();
        long f = 1;
        for (; n > 1; n--) {
            f *= n;
        }
        System.out.println(f);
    }
}
