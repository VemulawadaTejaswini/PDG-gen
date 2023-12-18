import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static int A;
    private static int B;
    private static int C;

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            A = in.nextInt();
            B = in.nextInt();
            C = in.nextInt();
            int[] l = new int[N];
            for (int i = 0; i < N; i++) {
                l[i] = in.nextInt();
            }

            int minCost = (int) 1e9;
            LinkedList<Node> queue = new LinkedList<>();
            {
                queue.add(new Node(l, 0));
            }
            for (; !queue.isEmpty();) {
                Node node = queue.poll();

                int cost = node.MP + node.diff();
                minCost = Math.min(minCost, cost);

                int length = node.l.length;
                if (length == 3) {
                    continue;
                }
                for (int i = 0; i < length - 1; i++) {
                    for (int j = 0; j < length; j++) {
                        if (j == i) {
                            continue;
                        }
                        int[] newL = new int[length - 1];
                        int k2 = 0;
                        for (int k = 0; k < length; k++) {
                            if (k == i || k == j) {
                                continue;
                            }
                            newL[k2++] = node.l[k];
                        }
                        newL[k2] = node.l[i] + node.l[j];
                        Node e = new Node(newL, node.MP + 10);
                        if (e.MP + e.diff() < cost) {
                            queue.add(e);
                        }
                    }
                }
            }

            System.out.println(minCost);
        }
    }

    static class Node {
        int[] l;
        int MP;

        public Node(int[] l, int cost) {
            super();
            this.l = l;
            this.MP = cost;
        }

        public boolean hasABC() {
            int mask = 0;
            for (int i = 0; i < l.length; i++) {
                if (l[i] == A) {
                    mask |= 1 << 0;
                }
                if (l[i] == B) {
                    mask |= 1 << 1;
                }
                if (l[i] == C) {
                    mask |= 1 << 2;
                }
            }
            return Integer.bitCount(mask) == 3;
        }

        public int diff() {
            int min = (int) 1e9;
            for (int i = 0; i < l.length; i++) {
                for (int j = 0; j < l.length; j++) {
                    if (j == i) {
                        continue;
                    }
                    for (int k = 0; k < l.length; k++) {
                        if (k == i || k == j) {
                            continue;
                        }

                        min = Math.min(min, Math.abs(A - l[i]) + Math.abs(B - l[j]) + Math.abs(C - l[k]));
                    }
                }
            }
            return min;
        }
    }
}
