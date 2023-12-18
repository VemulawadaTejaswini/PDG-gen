import java.util.*;

public class Main {
    static Node[] list;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long c = in.nextLong();
        list = new Node[n + 1];
        list[0] = new Node(0, 0);
        for(int i = 1; i <= n; i++) {
            list[i] = new Node(in.nextLong(), in.nextLong());
        }
        boolean[] used = new boolean[n + 1];
        used[0] = true;
        update(c, 0, used);
        long ans = 0;
        for(Node node: list) {
            ans = Math.max(ans, node.sum);
        }
        System.out.println(ans);
    }

    public static void update(long c, int idx, boolean[] used) {
        for(int i = 0; i < list.length; i++) {
            long sum = list[idx].sum - Math.min(Math.abs(list[i].pos - list[idx].pos), c - list[i].pos + list[idx].pos) + list[i].value;
            if(!used[i] && sum > list[i].sum) {
                used[i] = true;
                list[i].sum = sum;
                update(c, i, used);
                used[i] = false;
            }
        }
    }
}

class Node {
    long pos, value, sum = 0;
    public Node(long p, long v) {
        this.pos = p;
        this.value = v;
    }
}