import java.util.Scanner;

/**
 * Search
 */
public class Main {

    int n;
    int[] a;
    int q;
    int[] m;

    public void run() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        q = sc.nextInt();
        m = new int[q];
        for (int i = 0; i < q; i++) {
            m[i] = sc.nextInt();
            System.out.println((this.search(0, 0, m[i]) ? "yes" : "no"));
        }

    }

    boolean search(int num, int cnt, int _m) {
        if (num > _m) {
            return false;
        } else if (num == _m) {
            // System.out.println("yes");
            return true;
        } else if (cnt == n) {
            // System.out.println("no");
            return false;
        }
        return (search(num, cnt + 1, _m) || search(num + a[cnt], cnt + 1, _m));
    }

    public static void main(String[] args) {
        (new Main()).run();
    }
}
