import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 102B - Maximum Difference

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (i > 0) {
                for (int j = 0; j < i; j++) {
                    int sa = Math.abs(a[i] - a[j]);
                    if (max < sa) max = sa;
                }
            }
        }
        System.out.println(max);
    }
}