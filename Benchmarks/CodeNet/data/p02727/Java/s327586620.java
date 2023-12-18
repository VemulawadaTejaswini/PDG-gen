import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = Long.parseLong(sc.next());
        long y = Long.parseLong(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        LinkedList<Long> p = new LinkedList<>();
        LinkedList<Long> q = new LinkedList<>();
        LinkedList<Long> r = new LinkedList<>();
        for (int i = 0; i < a; i++) {
            p.add(Long.parseLong(sc.next()));
        }
        for (int i = 0; i < b; i++) {
            q.add(Long.parseLong(sc.next()));
        }
        for (int i = 0; i < c; i++) {
            r.add(Long.parseLong(sc.next()));
        }
        Collections.sort(p);
        Collections.sort(q);
        Collections.sort(r);
        int k = (int) (x + y);
        long ans = 0;
        for (int i = 0; i < a - x; i++) {
            p.poll();
        }
        for (int i = 0; i < b - y; i++) {
            q.poll();
        }
        for (int i = 0; i < k; i++) {
            long pp = p.size() == 0 ? 0 : p.peekLast();
            long qq = q.size() == 0 ? 0 : q.peekLast();
            long rr = r.size() == 0 ? 0 : r.peekLast();
            if (pp > qq && pp > rr) {
                ans += p.pollLast();
            } else if (qq > pp && qq > rr) {
                ans += q.pollLast();
            } else {
                ans += r.pollLast();
            }
        }
        System.out.println(ans);
    }
}
