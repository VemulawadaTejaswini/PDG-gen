import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        List<Long> A = new ArrayList();
        for (int i = 0; i < N; i++) {
            A.add(scan.nextLong());
        }
        A.sort(Comparator.reverseOrder());
        PriorityQueue<Candidate> queue = new PriorityQueue<>(new CandidateComparator());
        long ans = 0;
        ans += A.get(0);
        if (N == 2) {
            System.out.println(ans);
            return;
        }
        queue.add(new Candidate(A.get(0), A.get(1)));
        for (int i = 2; i < N; i++) {
            long current = A.get(i);
            Candidate c = queue.poll();
            ans += c.value();
            queue.add(new Candidate(c.left, current));
            queue.add(new Candidate(current, c.right));
        }
        System.out.println(ans);
    }
    class Candidate {
        long left = 0;
        long right = 0;
        Candidate(long left, long right) {
            this.left = left;
            this.right = right;
        }
        long value() {
            return Math.min(left, right);
        }
    }
    class CandidateComparator implements Comparator<Candidate> {
        @Override
        public int compare(Candidate o1, Candidate o2) {
            long v1 = o1.value();
            long v2 = o2.value();
            if (v1 != v2) {
                return -Long.compare(v1, v2);
            }
            if (o1.left != o2.left) {
                return Long.compare(o1.left, o2.left);
            }
            return Long.compare(o2.left, o2.left);
        }
    }
}
