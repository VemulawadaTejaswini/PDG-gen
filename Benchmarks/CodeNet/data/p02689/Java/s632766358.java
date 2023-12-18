import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int n = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        boolean[] array = new boolean[n];

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            if (list.get(a) == list.get(b)) {
                array[a] = true;
                array[b] = true;
            } else if (list.get(a) > list.get(b)) {
                array[b] = true;
            } else {
                array[a] = true;
            }
        }

        int ans = 0;
        for (boolean x : array) {
            if (!x) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}