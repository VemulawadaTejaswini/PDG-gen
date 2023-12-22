import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("[\\s]+");
        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int i = 4; i > 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println(a[0]);
    }
}
