import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("[\\s]+");
        while (sc.hasNext()) {
            double v = sc.nextDouble();
            for (int i = 0;; i++) {
                if (9.8 * Math.sqrt(5 * i / 4.9) >= v) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}
