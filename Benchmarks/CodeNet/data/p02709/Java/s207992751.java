import java.util.Scanner;

public class Main {
    static final long mod = 1000000007L;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int total = 0;
        int l = 0;
        int r = n - 1;
        for (int i = 0; i < n; i++) {
            int max = -1;
            int maxi = -1;
            boolean targetIsLeft = false;
            for (int j = 0; j < n; j++) {
                if (a[j] * Math.abs(l - j) > max) {
                    max = a[j] * Math.abs(l - j);
                    maxi = j;
                    targetIsLeft = true;
                }

                if (a[j] * Math.abs(r - j) > max) {
                    max = a[j] * Math.abs(r - j);
                    maxi = j;
                    targetIsLeft = false;
                }
            }

            total += max;
            a[maxi] = -1;
            if (targetIsLeft) {
                l++;
            } else {
                r--;
            }
        }

        System.out.println(total);
    }
}
