import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static int f(int n) {
        if (n % 2 == 0) {
            return n / 2;
        } else {
            return 3 * n + 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] a = new int[1000005];
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 1000005; i++) {
            if (i == 0)
                a[i] = s;
            else {
                a[i] = f(a[i - 1]);
            }
            if (array.contains(a[i])) {
                System.out.println(i + 1);
                return;
            } else
                array.add(a[i]);
        }
    }

}
