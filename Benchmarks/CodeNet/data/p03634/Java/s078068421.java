import java.util.*;

public class Main {
    static int modP = 1000000007;
    static long inf  = Long.MAX_VALUE;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Integer, List<E>> map = new HashMap<>();
        for(int i = 0; i < n-1; i++) {
            int a = in.nextInt()-1;
            int b = in.nextInt()-1;
            int c = in.nextInt();

            List<E> leftList = map.containsKey(a) ? map.get(a) : new LinkedList<>();
            E atob = new E(a,b,c);
            leftList.add(atob);
            map.put(a, leftList);
            List<E> rightList = map.containsKey(b) ? map.get(b) : new LinkedList<>();
            E btoa = new E(b,a,c);
            rightList.add(btoa);
            map.put(b, rightList);
        }
        int q = in.nextInt();
        int k = in.nextInt()-1;
        List<Q> queries = new ArrayList<>();
        for(int i = 0; i < q; i++) {
            int x = in.nextInt()-1;
            int y = in.nextInt()-1;
            Q query = new Q(x,y);
            queries.add(query);
        }

        long[] dist = new long[n];
        Arrays.fill(dist, inf);

        dist[k] = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(k);
        while(!stack.isEmpty()) {
            int currentNode = stack.pop();
            List<E> edges = map.get(currentNode);
            for(E e : edges) {
                if(dist[e.to] != inf) continue;

                stack.push(e.to);
                dist[e.to] = dist[currentNode] + e.w;
            }
        }

        for(int i = 0; i < q; i++) {
            int x = queries.get(i).x;
            int y = queries.get(i).y;
            print(dist[x] + dist[y]);
        }
    }

    static void print(String s) {
        System.out.println(s);
    }

    static void print(int i) {
        System.out.println(i);
    }

    static void print(long i) {
        System.out.println(i);
    }
}

class Q {
    int x, y;
    Q(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class E {
    int from, to;
    long w;
    E(int from, int to, long w) {
        this.from = from;
        this.to = to;
        this.w = w;
    }
}