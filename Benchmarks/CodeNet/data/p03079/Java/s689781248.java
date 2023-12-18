
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    void run() {
        Scanner sc = new Scanner(System.in);
        int[] ar = new int[3];
        for (int i = 0; i < 3; i++) {
            ar[i] = sc.nextInt();
        }
        Arrays.sort(ar);

        if (ar[0] + ar[1] <= ar[2]) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }

    void debug(Object...os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
