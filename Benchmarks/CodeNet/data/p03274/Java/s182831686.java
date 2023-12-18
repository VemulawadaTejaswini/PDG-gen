import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt(), k = sc.nextInt();
        int[] x = new int[n];
        List<Integer> l = new ArrayList<>();
        List<Integer> r = new ArrayList<>();
        r.add(0);
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            if (x[i] >= 0) {
                r.add(x[i]);
            } else {
                l.add(x[i]);
            }
        }
        l.add(0);
        Collections.reverse(l);

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < k; i++) {
            int tmpr = Integer.MAX_VALUE, tmpl = Integer.MAX_VALUE;
            try {
                tmpr = r.get(i) * 2 + Math.abs(l.get(k - i));
            } catch (IndexOutOfBoundsException ignored) {
            }
            try {
                tmpl = Math.abs(l.get(i)) * 2 + r.get(k - i);
            } catch (IndexOutOfBoundsException ignored) {
            }
            ans = Math.min(Math.min(tmpr, tmpl), ans);
        }
        System.out.println(ans);
    }
}
