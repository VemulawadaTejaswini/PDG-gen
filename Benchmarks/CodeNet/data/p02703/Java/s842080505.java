import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int ms = (n-1) * 50;
        s = Math.min(s, ms);
        int[] a = new int[m];
        int[] u = new int[m];
        int[] v = new int[m];
        int[] b = new int[m];
        int[] c = new int[n];
        int[] d = new int[n];
        ArrayList<Integer>[] nexts = new ArrayList[n];
        for(int i=0; i<n; i++) {
            nexts[i] = new ArrayList<Integer>();
        }
        for(int i=0; i<m; i++) {
            u[i] = sc.nextInt()-1;
            v[i] = sc.nextInt()-1;
            nexts[u[i]].add(i);
            nexts[v[i]].add(i);
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++) {
            c[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }
        Set<Long> visited = new HashSet<Long>();
        State init = new State(0, s, 0);
        PriorityQueue<State> q = new PriorityQueue<>();
        long[] res = new long[n];
        int rem = n-1;
        q.add(init);
        while(!q.isEmpty()) {
            State st = q.poll();
            if(visited.contains(st.ps())) continue;
            if(st.p != 0 && res[st.p] == 0) {
                res[st.p] = st.d;
                rem--;
                if(rem == 0) break;
            }
            visited.add(st.ps());
            int ns = st.s + c[st.p];
            ns = Math.min(ns, ms);
            long nd = st.d + d[st.p];
            State nextState = new State(st.p, ns, nd);
            if(!visited.contains(nextState.ps())) {
                q.add(nextState);
            }
            for(int i=0; i<nexts[st.p].size(); i++) {
                int j = nexts[st.p].get(i);
                int np = u[j];
                if(u[j] == st.p) np = v[j];
                if(st.s < a[j]) continue;
                nextState = new State(np, st.s-a[j], st.d+b[j]);
                if(!visited.contains(nextState.ps())) {
                    q.add(nextState);
                }
            }
        }

        for(int i=1; i<n; i++) {
            System.out.println(res[i]);
        }



    }

    static class State implements Comparable<State>{
        int p;
        int s;
        long d;
        public State(int p, int s, long d) {
            this.p = p;
            this.s = s;
            this.d = d;
        }
        public int compareTo(State st) {
            return Long.compare(d, st.d);
        }
        long ps() {
            return ((long)p << 32) + s;
        }
    }

}