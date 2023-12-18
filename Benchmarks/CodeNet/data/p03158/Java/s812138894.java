import java.util.ArrayList;
import java.util.Scanner;

class Main {

    public static int kinjiti(int x, ArrayList<Integer> a) {
        int[] sa = new int[a.size()];

        for (int i = 0; i < a.size(); i++) {
            sa[i] = Math.abs(a.get(i) - x);
        }

        int min = sa[0];
        int idx = 0;

        for (int i = 1; i < sa.length; i++) {
            if (sa[i] < min) {
                min = sa[i];
                idx = i;
            }
        }

        return idx;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }

        int[] x = new int[q];
        for (int i = 0; i < q; i++) {
            x[i] = scanner.nextInt();
        }
        scanner.close();

        for (int i = 0; i < q; i++) {
            int ans = 0;
            ArrayList<Integer> _a = (ArrayList<Integer>) a.clone();

            try {
                while (true) {
                    ans += _a.get(_a.size() - 1);
                    _a.remove(_a.size() - 1);
                    _a.remove(kinjiti(x[i], _a));
                }

            } catch (Exception e) {
                System.out.println(ans);
            }

        }
    }

}
