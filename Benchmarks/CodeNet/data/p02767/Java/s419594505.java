import java.util.Scanner;

class Main {
    static int minOf(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = Integer.parseInt(stdIn.next());
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = Integer.parseInt(stdIn.next());
        }

        int xMin = minOf(x);
        int pNum = maxOf(x) - xMin + 1;
        int[] p = new int[pNum];
        int pos = xMin;
        for (int i = 0; i < pNum; i++) {
            for (int j = 0; j < n; j++) {
                p[i] += (x[j] - pos) * (x[j] - pos);
            }
            pos++;
        }

        System.out.println(minOf(p));
    }
}