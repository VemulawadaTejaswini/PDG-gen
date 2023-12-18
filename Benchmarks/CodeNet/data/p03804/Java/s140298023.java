import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] a = new String[n];
        String[] b = new String[n];
        boolean can = false;
        for (int i = 0; i < n; i++) {
            a[i] = sc.next();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.next();
        }
        for (int i = 0; i < n - m + 1; i++) {
            for (int j = 0; j < n - m + 1; j++) {
                // [i][j] = 左上
                int cnt = 0;
                for (int k = i; k + i < m; k++) {
                    String t = a[k].substring(j, j + m);
                    if (t.equals(b[k - i])) {
                        cnt++;
                    } else {
                        break;
                    }
                }
                if (cnt == m) {
                    can = true;
                    break;
                }
            }
            if (can) {
                break;
            }
        }
        if (can) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}