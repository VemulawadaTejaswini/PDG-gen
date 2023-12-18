import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int q = sc.nextInt();
        List<Query> ql = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            int t = sc.nextInt();
            Query qy = null;
            if (t == 1) {
                qy = new Query(1);
            } else {
                qy = new Query(2, sc.nextInt(), sc.next().charAt(0));
            }
            ql.add(qy);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(s);
        for (Query qq : ql) {
            if (qq.t == 1) {
                sb = sb.reverse();
            } else {
                if (qq.f == 1) {
                    sb.insert(0, qq.c);
                } else {
                    sb.append(qq.c);
                }
            }
        }
        System.out.println(sb.toString());
    }

    static class Query{
        int t;
        int f;
        char c;

        public Query(int t) {
            this.t = t;
        }

        public Query(int t, int f, char c) {
            this.t = t;
            this.f = f;
            this.c = c;
        }
    }
}