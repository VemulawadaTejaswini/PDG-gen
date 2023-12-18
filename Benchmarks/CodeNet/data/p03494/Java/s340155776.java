import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int count = 0;
        boolean flag = true;

        while (true) {
            for (int i = 0; i < n; i++) {
                if (a[i] % 2 == 1) flag = false;
                else a[i] /= 2;
            }

            if (flag) count++;
            else break;
        }

        System.out.println(count);
    }
}
