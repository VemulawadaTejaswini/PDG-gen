
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    int n;
    int[] a;

    Main(int n, int[] a) {
        this.n = n;
        this.a = a;
    }

    /**
     * 
     * @return greeting message
     */
    public int[] solve() {

        ArrayList<Pair> plist = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            plist.add(new Pair(i, a[i - 1]));
        }

        Collections.sort(plist);

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = plist.get(i).num;
        }

        return ans;
    }

    class Pair implements Comparable<Pair> {

        int num;
        int ord;

        Pair(int num, int ord) {
            this.num = num;
            this.ord = ord;
        }

        @Override
        public int compareTo(Pair other) {
            return Integer.compare(this.ord, other.ord);
        }
    }

    public static void main(String[] args) {

        // input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        // solve
        int[] p = new Main(n, a).solve();

        // display
        for (int pi : p) {
            System.out.print(pi + " ");
        }
        System.out.println();
    }

}
