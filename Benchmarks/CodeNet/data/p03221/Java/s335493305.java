import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] p = new int[m];
        int[] y = new int[m];
        ArrayList<ArrayList<Integer>> pref = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n + 1; i++) pref.add(new ArrayList<Integer>());
        for (int i = 0; i < m; i++) {
            p[i] = Integer.parseInt(sc.next());
            y[i] = Integer.parseInt(sc.next());
            pref.get(p[i]).add(y[i]);
        }
        for (int i = 1; i <= n; i++) Collections.sort(pref.get(i));
        for (int i = 0; i < m; i++) {
            System.out.printf("%06d", p[i]);
            System.out.printf("%06d\n", Collections.binarySearch(pref.get(p[i]), y[i]) + 1);
        }
    }
}