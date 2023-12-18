import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        N*=3;
        int[] a = new int[N];
        int[] a_l = new int[N/3];
        int[] a_r = new int[2*N/3];
        PriorityQueue<Integer> left = new PriorityQueue<Integer>((o1, o2)->Integer.compare(o1, o2));
        PriorityQueue<Integer> right_unused = new PriorityQueue<Integer>((o1, o2)->Integer.compare(o1, o2));
        PriorityQueue<Integer> right_used = new PriorityQueue<Integer>((o1, o2)->Integer.compare(o2, o1));
        long l = 0L;
        long r = 0L;
        for (int i=0;i<N;i++) {
            a[i] = Integer.parseInt(sc.next());
            if (i<N/3) {
                a_l[i]=a[i];
                l+=a_l[i];
                left.add(a_l[i]);
            }
            if (i>=N/3) {
                a_r[i-N/3]=a[i];
            }
        }
        Arrays.sort(a_l);
        Arrays.sort(a_r);
        for (int i=0;i<N/3;i++) {
            r+=a_r[i];
            right_used.add(a_r[i]);
        }
        for (int i=N/3;i<2*N/3;i++) {
            right_unused.add(a_r[i]);
        }
        long ans = l-r;
        // System.out.println(left);
        // System.out.println(right_used);
        // System.out.println(right_unused);
        for (int i=N/3;i<2*N/3;i++) {
            if (right_unused.contains(a[i])) {
                right_unused.remove(a[i]);
            } else { // right_used.contains(a[i])
                r -= a[i]-right_unused.peek();
                right_used.remove(a[i]);
                right_used.add(right_unused.poll());
            }
            if (left.peek()<a[i]) {
                l += a[i]-left.peek();
                left.remove();
                left.add(a[i]);
            }
            ans = Math.max(ans, l-r);
        }
        System.out.println(ans);
        // Arrays.sort(a_r, (o1, o2)->Integer.compare(o2, o1));
    }
}