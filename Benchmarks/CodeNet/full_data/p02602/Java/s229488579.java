
import java.util.HashMap;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(), K = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
            if (i>=K) {
                System.out.println(arr[i]>arr[i-K]?"Yes":"No");
            }
        }
    }

    private static boolean max1(int a, int b, int c, int k) {
        boolean ans = true;
        while (k>0) {
            if (b<=a) {
                b*=2;
                k--;
            } else if (c<=b) {
                c*=2;
                k--;
            }
            if (c>b&&b>a)
                break;
        }
        return c>b&&b>a;
    }

}
