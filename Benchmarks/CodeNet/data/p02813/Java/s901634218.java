import java.util.*;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int N = Integer.parseInt(sc.next());
        StringBuilder P = new StringBuilder();
        for (int i=0; i<N; i++) {
            P.append(sc.next());
        }
        StringBuilder Q = new StringBuilder();
        for (int i=0; i<N; i++) {
            Q.append(sc.next());
        }
        sc.close();

        Inner inner = new Inner();
        inner.init(N);
        inner.perm(1);

        System.out.println(Math.abs(inner.get(P.toString()) - inner.get(Q.toString())));

    }
    static class Inner {
        private int[] p;
        private int N;
        private List<String> list;
        void init(int N) {
            this.N = N;
            p = new int[N+1];
            for (int i=1; i<=N; i++) {
                p[i] = i;
            }
            list = new ArrayList<>();
        }
        void perm(int i) {
            int j, k, t;
    
            if (i<N) {
                for (j=i; j<=N; j++) {
                    t=p[j];
                    for (k=j; k>i; k--) {
                        p[k] = p[k-1];
                    }
                    p[i]=t;
                    perm(i+1);
                    for (k=i; k<j; k++) {
                        p[k] = p[k+1];
                    }
                    p[j]=t;
                } 
            } else {
                StringBuilder sb = new StringBuilder();
                for (j=1; j<=N; j++) {
                    sb.append(p[j]);
                }
                list.add(sb.toString());
            }
        }
        int get(String s) {
            return list.indexOf(s);
        }
    }
}