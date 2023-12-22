import java.util.Arrays;
import java.util.Scanner;

//155
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), d[] = new int[n], a[] = new int[n],max=1;
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }
        Arrays.fill(a, 1);
        for (int i = 1; i < n; i++) {
            if (d[i - 1] < d[i]) {
                if (a[i - 1] == 1) {
                    a[i] = 3;
                } else {
                    a[i] = a[i - 1] + 1;
                }
                max=Math.max(max, a[i]);
            }
        }
        System.out.println(max);
    }
}
