import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        int c1 = 0, c2 = 0;
        for (int x : a) {
            if (x % 4 == 0) {
                c1++;
            } else if (x % 2 == 0) {
                c2++;
            }
        }
        System.out.println((c1 + c2 / 2 >= n / 2 ? "Yes" : "No"));
    }
}