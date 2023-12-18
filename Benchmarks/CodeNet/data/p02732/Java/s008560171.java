import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        int[] a = new int[n];
        int[] count = new int[200001];
        int[] comb = new int[200001];
        int[] diff = new int[200001];
        int cn = 0;
        int ai, c, ci;
        for (int i = 0; i < 200001; i++) {
            count[i] = 0;
            comb[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            ai = Integer.parseInt(scanner.next());
            a[i] = ai;
            count[ai] += 1; 
        }
        // System.out.println(Arrays.toString(count));
        for (int i: a) {
            c = count[i];
            ci = cmb(c);
            comb[i] = ci;
            diff[i] = ci - cmb(c-1);
        }
        for (int i: comb) {
            cn += i;
        }
        for (int i: a) {
            System.out.println(cn-diff[i]);
        }
    }
    public static int cmb(int x) {
        if (x < 2) {
            return 0;
        }
        return (x*(x-1))/2;
    }
}