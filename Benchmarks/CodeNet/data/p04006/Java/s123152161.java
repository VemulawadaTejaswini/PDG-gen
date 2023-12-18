import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        long x = Integer.parseInt(sc.next());
        int[] a = new int[N];
        PriorityQueue<Integer> q = new PriorityQueue<Integer>((o1, o2)->Integer.compare(o2, o1));
        int a_min = 1_500_000_000;
        long sum = 0L;
        for (int i=0;i<N;i++) {
            a[i] = Integer.parseInt(sc.next());
            sum+=a[i];
            q.add(a[i]);
            a_min = Math.min(a_min, a[i]);
        }

        long ans = 1_000_000_000_000_000_000L;
        for (int i=0;i<N;i++) {
            ans = Math.min(ans, sum+x*i);
            int tmp = q.remove();
            sum-=tmp;
            sum+=a_min;
        }
        System.out.println(ans);
    }
}