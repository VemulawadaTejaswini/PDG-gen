import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);;
    static int MOD = 1000000007;

    public static void main(String[] args) {
        int N = sc.nextInt();
        Node[] nodes = new Node[N];
        for (int i = 0; i < N; i++) nodes[i] = new Node();
        for (int i = 0; i < N - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            nodes[a].add(nodes[b]);
            nodes[b].add(nodes[a]);
        }

        for (int i = 0; i < N; i++) {
            System.out.println(nodes[i].getComb(null));
        }
    }
}

class Node {
    ArrayList<Node> links = new ArrayList<>();
    HashMap<Node, Long> comb = new HashMap<>();
    HashMap<Node, Long> num = new HashMap<>();

    void add(Node node) {
        links.add(node);
    }

    long getComb(Node node) {
        long ans = 1;
        long max = 0;
        long div = 1;
        for (Node link : links) if (link != node) {
            if (!comb.containsKey(link)) comb.put(link, link.getComb(this));
            ans = mul(ans, comb.get(link));
            if (max < link.getNum(this)) {
                div = mul(div, fact(max));
                max = link.getNum(this);
            } else {
                div = mul(div, fact(link.getNum(this)));
            }
        }
        return div(mul(ans, perm(getNum(node) - 1, getNum(node) - 1 - max)), div);
    }

    long getNum(Node node) {
        long ans = 1;
        for (Node link : links) if (link != node) {
            if (!num.containsKey(link)) num.put(link, link.getNum(this));
            ans += num.get(link);
        }
        return ans;
    }

    long[] fact = new long[100];
    long fact(long a) {
        if (a <= 1) return 1;
        if (a < fact.length) {
            if (fact[(int) a] == 0) fact[(int) a] = mul(a, fact(a - 1));
            return fact[(int) a];
        }
        long ret = fact(fact.length - 1);
        for (int i = fact.length; i < a; i++) {
            ret = mul(ret, i);
        }
        return ret;
    }

    long perm(long a, long b) {
        long ret = 1;
        for (int i = 0; i < b; i++) {
            ret = mul(ret, a - i);
        }
        return ret;
    }

    long mul(long a, long b) {
        return (a * b) % Main.MOD;
    }

    long div(long a, long b) {
        return mul(a, modInv(b));
    }

    long modInv(long a) {
        long b = Main.MOD, u = 1, v = 0;
        while (b != 0) {
            long t = a / b;
            long s;
            a -= t * b;
            s = a;
            a = b;
            b = s;
            u -= t * v;
            s = u;
            u = v;
            v = s;
        }
        return (u + Main.MOD) % Main.MOD;
    }
}