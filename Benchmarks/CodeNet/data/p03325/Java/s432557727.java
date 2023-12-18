import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] a = new long[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextLong();
        }

        int c = 0;
        while (true) {
            boolean flag = false;
            for (int i = 0; i < N; i++) {
                if (a[i] % 2 == 0) flag = true;
            }

            if (!flag) break;

            int maxIndex = -1;
            for (int i = 0; i < N; i++) {
                if (a[i] % 2 != 0) {
                    a[i] *= 3;
                } else {
                    if (maxIndex == -1) {
                        maxIndex = i;
                    } else {
                        if (a[maxIndex] < a[i]) {
                            maxIndex = i;
                        }
                    }
                }
            }
            for (int i = 0; i < N; i++) {
                if (i == maxIndex) {
                    a[i] /= 2;
                } else {
                    a[i] *= 3;
                }
            }
            c++;
        }
        System.out.println(c);
    }
}
