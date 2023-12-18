import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] p = new int[n];
        for(int i=0; i<n; i++) {
            p[i] = in.nextInt();
        }
        memo = new HashMap<>();

        int s = 0;
        for(int l=0; l<n-1; l++) {
            for(int r=l+1; r<n; r++) {
                s+= get2ndMax(p, l, r);
            }
        }
        System.out.println(s);
    }
    private static Map<String, Integer> memo;
    private static int get2ndMax(int[] p, int l, int r) {
        String key = l + "_" + r;
        if(memo.containsKey(key)) {
            return memo.get(key);
        }
        PriorityQueue<Integer> q = new PriorityQueue<>(r-l, Collections.reverseOrder());
        for(int i=l; i<=r; i++) {
            q.add(p[i]);
        }
        q.poll();
        int result = q.poll();
        memo.put(key, result);
        return result;
    }
}
