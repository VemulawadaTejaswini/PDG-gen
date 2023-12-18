import java.util.*;

public class Main {

    static int N;
    static int x;
    static int[] a;

    private static int transform(Set<Integer> caught, int i) {
        int ret = 0;
        while (caught.contains((i - ret + N) % N)) {
            ret++;
        }
        return ret;
    }

    private static Set<Integer> cast(Set<Integer> caught, int n) {
        Integer[] arr = caught.toArray(new Integer[caught.size()]);
        Set<Integer> newSet = new HashSet<>();
        for (int i = 0; i < caught.size(); i++) {
            newSet.add((arr[i] + n + N) % N);
        }
        return newSet;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        x = sc.nextInt();
        a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        Set<Integer> caught = new HashSet<>();
        int ans = 0;

        while (caught.size() < N) {
            int minCost = Integer.MAX_VALUE;
            int minID = 0;
            for (int i = 0; i < N; i++) {
                if ((a[i] + transform(caught, i) * x) < minCost) {
                    minCost = a[i] + transform(caught, i) * x;
                    minID = i;
                }
            }
            int t = transform(caught, minID);
            caught = cast(caught, t);
            ans += minCost;
            caught.add(minID);
        }

        System.out.println(ans);
    }
}