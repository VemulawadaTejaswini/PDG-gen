import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        List<Res> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            int a = Integer.parseInt(sc.next());
            list.add(new Res(i + 1, s, a));
        }
        Collections.sort(list);
        list.stream()
                .forEach(s -> System.out.println(s.idx));
    }

    public static class Res implements Comparable<Res> {
        int idx;
        String s;
        int p;

        public Res(int idx, String s, int p) {
            this.idx = idx;
            this.s = s;
            this.p = p;
        }

        @Override
        public int compareTo(Res r) {
            int c = this.s.compareTo(r.s);
            if (c == 0) {
                if (this.p > r.p) {
                    return -1;
                } else if (this.p < r.p) {
                    return 1;
                } else {
                    return 0;
                }
            }
            return this.s.compareTo(r.s);
        }
    }
}