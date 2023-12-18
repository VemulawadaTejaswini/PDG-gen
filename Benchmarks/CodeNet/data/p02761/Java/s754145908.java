import java.util.*;

class Main {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Main m = new Main();
        m.run();
    }

    private void run() {
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n+1];
        for (int i = 0; i < n+1; i++) {
            a[i] = -1;
        }

        for (int i = 0; i < m; i++) {
            int s = sc.nextInt();
            int c = sc.nextInt();
            if (a[s] != -1 && a[s] != c || s == 1 && c == 0 && n > 1) {
                System.out.println(-1);
                return;
            }
            a[s] = c;
        }

        StringBuilder sb = new StringBuilder();

        if (n > 1) {
            sb.append(a[1] == -1 ? 1 : a[1]);
        } else {
            sb.append(a[1] == -1 ? 0 : a[1]);
        }
        for (int i = 2; i < n+1; i++) {
            sb.append(a[i] == -1 ? 0 : a[i]);
        }
        System.out.println(sb.toString());
    }
}
