import java.util.*;

public class Main {
    private class Node {
        List<Integer> path = new ArrayList<>();
    }

    public void main(Scanner sc) {
        int n = sc.nextInt();
        Node nodes[] = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node();
        }

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            nodes[a].path.add(b);
            nodes[b].path.add(a);
        }

        LinkedList<Integer> ans = new LinkedList<>();
        ans.add(0);
        ans.add(nodes[0].path.get(0));
        while (true) {
            int s = ans.getFirst();
            boolean add = false;
            for (Integer sp : nodes[s].path) {
                if (!ans.contains(sp)) {
                    ans.addFirst(sp);
                    add = true;
                    break;
                }
            }
            if (add) {
                continue;
            }

            int e = ans.getLast();
            add = false;
            for (Integer ep : nodes[e].path) {
                if (!ans.contains(ep)) {
                    ans.addLast(ep);
                    add = true;
                }
            }
            if (!add) {
                break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Integer p : ans) {
            sb.append(p + 1);
            sb.append(" ");
        }
        System.out.println(ans.size());
        System.out.println(sb.toString().trim());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
