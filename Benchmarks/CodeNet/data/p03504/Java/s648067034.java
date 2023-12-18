import static java.util.Comparator.*;

import java.util.*;

public class Main {
    private class Span {
        int s, t, c;

        public Span(int s, int t, int c) {
            this.s = s;
            this.t = t;
            this.c = c;
        }
    }

    public void main(Scanner sc) {
        int n = sc.nextInt();
        int c = sc.nextInt();
        List<Span> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Span(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }

        list.sort(comparing(o -> ((Span) o).s).thenComparing(
            comparing(o -> ((Span) o).t).reversed()));

        int cnt = 0;
        while (!list.isEmpty()) {
            cnt++;
            int nowt = 0;
            int nowc = 0;
            for (Iterator<Span> ite = list.iterator(); ite.hasNext();) {
                Span channel = ite.next();
                if (nowt < channel.s) {
                    nowt = channel.t;
                    ite.remove();
                } else if (nowt == channel.s && nowc == channel.c) {
                    nowt = channel.t;
                    nowc = channel.c;
                    ite.remove();
                }
            }
        }

        System.out.println(cnt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
