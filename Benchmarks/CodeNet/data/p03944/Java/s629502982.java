import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = Integer.parseInt(sc.next());
        int h = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());
        int x[] = new int[n];
        int y[] = new int[n];
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = Integer.parseInt(sc.next());
            y[i] = Integer.parseInt(sc.next());
            a[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        int w0 = 0, h0 = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 1 && w0 < x[i]) {
                w0 = x[i];
            } else if (a[i] == 2 && w > x[i]) {
                w = x[i];
            } else if (a[i] == 3 && h0 < y[i]) {
                h0 = y[i];
            } else if (a[i] == 4 && h > y[i]) {
                h = y[i];
            }
        }
        if (w - w0 <= 0 || h - h0 <= 0) {
            System.out.println(0);
        } else {
            System.out.println((w - w0) * (h - h0));
        }
    }
}