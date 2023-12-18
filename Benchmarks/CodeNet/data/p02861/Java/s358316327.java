import java.util.*;
 
public class Main {

    private static int N;
    private static int[] x;
    private static int[] y;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        x = new int[N];
        y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        Set<Integer> used = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        double sum = dfs(used, list);
        int div = 1;
        for (int i = 1; i <= N; i++) {
            div *= i;
        }
        System.out.println(sum/div);
    }

    private static double dfs(Set<Integer> used, List<Integer> list) {

        if (used.size() == N) {
            double ret = 0;
            for (int i = 0; i < N-1; i++) {
                int idx1 = list.get(i);
                int idx2 = list.get(i+1);
                int dx = x[idx1]-x[idx2];
                int dy = y[idx1]-y[idx2];
                ret += Math.sqrt(dx*dx+dy*dy);
            }
            return ret;
        }

        double sum = 0;
        for (int i = 0; i < N; i++) {
            if (!used.contains(i)) {
                used.add(i);
                list.add(i);
                sum += dfs(used, list);
                used.remove(i);
                list.remove(list.size()-1);
            }
        }
        return sum;
    }


}
