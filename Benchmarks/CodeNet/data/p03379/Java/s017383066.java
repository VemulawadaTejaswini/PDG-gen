import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Integer[] a = new Integer[N];
        for (int i=0; i<N; i++) {
            a[i] = sc.nextInt();
        }

        int[] ans = solve(N, a);

        for (int i=0; i<N; i++) {
            System.out.println(ans[i]);
        }
    }

    private static int[] solve(int N, Integer[] a) {
        int[] ans = new int[N];
        List<Integer> list = Arrays.asList(a.clone());

        Collections.sort(list);

        for (int i=0; i<N; i++) {
            ans[i] = a[i] <= list.get(N/2 - 1) ? list.get(N/2) : list.get(N/2 - 1);
        }

        return ans;
    }
}