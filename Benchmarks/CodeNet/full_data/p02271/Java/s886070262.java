import java.util.Scanner;

public class Main {
    public static int n,q;;
    public static int[] m = new int[201];
    public static int[] A = new int[21];
    public static void main(String[] args) {
        //データの読込
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            m[i] = sc.nextInt();
        }

        //データの処理
        for (int i = 0; i < q; i++) {
            boolean result = solved(m[i], 0, 0);
            if (result) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

    public static boolean solved(int m, int index, int x) {
        if (m == x) return true;

        for (int i = index; i < n; i++) {
            if (solved(m, i + 1, x + A[i])) return true;
        }

        return false;
    }
}
