import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        List<Integer> S = new ArrayList<Integer>();
        List<Integer> T = new ArrayList<Integer>();
        int sum = 0;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            S.add(sc.nextInt());
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            T.add(sc.nextInt());
        }
        for (int i = 0; i < q; i++) {
            sum += search(S, 0, n, T.get(i));
        }
        System.out.println(sum);
        sc.close();
    }

    private static int search(List<Integer> list, int L, int R, int target) {
        while (L < R) {
           int pivot = (L + R) / 2;
            if (list.get(pivot) < target) {
                L = pivot + 1;
            } else if (list.get(pivot) > target) {
                R = pivot;
            } else {
                return 1;
            }
        }
        if (L == target) {
            return 1;
        } else {
            return 0;
        }
    }
}
