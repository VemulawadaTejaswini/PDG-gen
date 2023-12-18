import java.util.Scanner;

public class Main {
    static int[] m;

    static void swapWithRight(int i) {
        int s = m[i + 1];
        m[i + 1] = m[i];
        m[i] = s;
    }

    static void swapWithLeft(int i) {
        int s = m[i - 1];
        m[i - 1] = m[i];
        m[i] = s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        m = new int[n];
        for (int i = 0; i < n; ++i) m[i] = in.nextInt();
        int res = 0;
        for (int i = 0; i < n; ++i) {
            if (i == 0 && m[i] == i + 1) {
                swapWithRight(i);
                ++res;
            } else if (i == n - 1 && m[i] == i + 1) {
                swapWithLeft(i);
                ++res;
            } else if (m[i] == i + 1) {
                if (m[i - 1] > m[i]) {
                    swapWithRight(i);
                } else {
                    swapWithLeft(i);
                }
                ++res;
            }
        }
        System.out.println(res);
    }
}