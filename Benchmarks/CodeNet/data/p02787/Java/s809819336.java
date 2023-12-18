import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int n = sc.nextInt();
        int[][] ab = new int[n][3];
        for (int i = 0; i < n; i++) {
            ab[i][0] = sc.nextInt();
            ab[i][1] = sc.nextInt();
            ab[i][2] = (ab[i][0] * 100000) / ab[i][1];
        }
        Ab[] data = new Ab[n];
        for (int i = 0; i < n; i++) {
            data[i] = new Ab(ab[i][0], ab[i][1], ab[i][2]);
        }
        Arrays.sort(data);

        int magicCount = h / data[n - 1].a;
        int useMagicPoint = magicCount * data[n - 1].b;

        int resultHitPoint = h % data[n - 1].a;
        int minMagicPointUsage = 9999;
        for (int i = 0; i < n; i++) {
            int magicPointUsage;
            if (resultHitPoint % data[i].a == 0) magicPointUsage = data[i].b * (resultHitPoint / data[i].a);
            else magicPointUsage = data[i].b * ((resultHitPoint / data[i].a) + 1);

            if (minMagicPointUsage > magicPointUsage) {
                minMagicPointUsage = magicPointUsage;
            }
        }

        System.out.println(useMagicPoint + minMagicPointUsage);
    }

    public static class Ab implements Comparable<Ab> {
        int a, b, c;

        public Ab(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public int compareTo(Ab other) {
            if (this.c == other.c) {
                return other.a - this.a;
            } else {
                return this.c - other.c;
            }
        }
    }
}