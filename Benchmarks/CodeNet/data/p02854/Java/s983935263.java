import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        long[] as = new long[n];
        for (int i = 0; i < n; i++) {
            as[i] = std.nextInt();
        }

        int nextleft = 0;
        int nextRight = n - 1;
        int leftLen = 0;
        int rightLen = 0;
        while (nextleft <= nextRight) {
            if (leftLen <= rightLen) {
                leftLen += as[nextleft];
                nextleft++;
            } else {
                rightLen += as[nextRight];
                nextRight--;
            }
        }

        System.out.println(Math.abs(leftLen - rightLen));
    }
}
