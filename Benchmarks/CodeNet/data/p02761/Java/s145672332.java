import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n;
    static int m;
    static int[] a;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        a = new int[n];
        Arrays.fill(a, -1);

        boolean bl = true;
        for (int i = 0; i < m; i++) {
            int k = sc.nextInt() - 1;
            int num = sc.nextInt();
            //0以外の00 000はダメ
            if (k == 0 && num == 0 && n > 1) {
                bl = false;
                break;
            }
            if (a[k] == -1) {
                a[k] = num;
            } else {
                //同じ指定で違う値はありえない
                if (a[k] != num) {
                    bl = false;
                    break;
                }
            }
        }
        //-1 は最小値0に置き換え
        for (int i = 0; i < n; i++) {
            if (a[i] == -1) {
                a[i] = 0;
            }
        }
        //0123 -> 1123
        if (a[0] == 0) a[0] = 1;

        if (m == 0) {
            System.out.print(1);
            for (int i = 1; i < n; i++) {
                System.out.print(0);
            }
            System.out.println();
        } else if (bl) {
            for (int num : a) {
                System.out.print(num);
            }
            System.out.println();
        } else {
            System.out.println(-1);
        }
    }
}
