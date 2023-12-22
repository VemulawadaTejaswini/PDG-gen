import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int max = 0;
    @SuppressWarnings("resource")
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static int m = sc.nextInt();
    static int q = sc.nextInt();
    static int[] a = new int[q];
    static int[] b = new int[q];
    static int[] c = new int[q];
    static int[] d = new int[q];

    public static void main(String[] args) {
        for (int i = 0; i < q; i++) {
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt() - 1;
            c[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }
        List<Integer> list = new ArrayList<Integer>();
        dfs(list);
        System.out.println(max);
    }

    static void dfs(List<Integer> list) {
        if (list.size() == n) {
            int sum = 0;
            for (int i = 0; i < q; i++) {
                if (list.get(b[i]) - list.get(a[i]) == c[i]) {
                    sum += d[i];
                }
            }
            max = Math.max(max, sum);
            return;
        }
        for (int i = 0; i < 10; i++) {
            if ((list.size() == 0 || i >= list.get(list.size() - 1)) && i <= m - 1) {
                list.add(i);
                dfs(list);
                list.remove(list.size() - 1);
            }
        }
    }

}