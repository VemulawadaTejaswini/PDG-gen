import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] s = new int[n + 1];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.nextInt();
        }
        int q = scanner.nextInt();
        int[] t = new int[q];
        for (int i = 0; i < q; i++) {
            t[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < q; i++) {
            if (LinearSearch(s, t[i])) {
                count++;
            }
        }
        System.out.println(count);
    }

    static boolean LinearSearch(int[] a, int key) {
        int i = 0;
        a[a.length - 1] = key;
        while (a[i] != key) {
            i++;
        }
        if (i == a.length - 1) {
            return false;
        }
        return true;
    }
}
