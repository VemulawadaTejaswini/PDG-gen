import java.util.*;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            int[] x = new int[n];
            for (int i = 0; i < n; ++i) x[i] = sc.nextInt();
            ArrayList<Integer> l = new ArrayList<Integer>();
            int sum = 0;
            for (int i = 0; i < n-1; ++i) {
                l.add(x[i+1]-x[i]);
                sum += x[i+1]-x[i];
            }
            Collections.sort(l, (i1, i2)->i2-i1);
            if (k >= n) { sum = 0; }
            else {
                for (int i = 0; i < k-1; ++i) {
                    sum -= l.get(i);
                }
            }
            System.out.println(sum);
        }
    }
}