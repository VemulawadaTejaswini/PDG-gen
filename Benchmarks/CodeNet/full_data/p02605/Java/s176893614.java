import java.util.*;

public class Main {

    static class Node {
        int x, y;
        char ch;
        Node(int x, int y, char ch) {
            this.x = x;
            this.y = y;
            this.ch = ch;
        }
    }
    static int n;
    static Node[] a;

    private static long process1() {
        Map<Integer, List<Node>> M = new HashMap();
        for (int i = 0; i < n; i++) {
            int tem = a[i].x + a[i].y;
            if (a[i].ch != 'U' && a[i].ch != 'R') continue;
            if (M.containsKey(tem) == false) {
                List<Node> list = new ArrayList();
                M.put(tem, list);
            }
            List<Node> list = M.get(tem);
            list.add(a[i]);
        }
        long ans = Long.MAX_VALUE;
        for (List<Node> list : M.values()) {
            Collections.sort(list, (a, b) -> (a.x - b.x));
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i - 1).ch != 'R' || list.get(i).ch != 'U') continue;
                ans = Math.min(ans, (list.get(i).x - list.get(i - 1).x) * 10L);
            }
        }
        return ans;
    }

    private static long process2() {
        Map<Integer, List<Node>> M = new HashMap();
        for (int i = 0; i < n; i++) {
            int tem = a[i].x;
            if (a[i].ch != 'U' && a[i].ch != 'D') continue;
            if (M.containsKey(tem) == false) {
                List<Node> list = new ArrayList();
                M.put(tem, list);
            }
            List<Node> list = M.get(tem);
            list.add(a[i]);
        }
        long ans = Long.MAX_VALUE;
        for (List<Node> list : M.values()) {
            Collections.sort(list, (a, b) -> (a.y - b.y));
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i - 1).ch != 'U' || list.get(i).ch != 'D') continue;
                ans = Math.min(ans, (list.get(i).y - list.get(i - 1).y) * 5L);
            }
        }
        return ans;
    }

    private static void rotate() {
        for (int i = 0; i < n; i++) {
            int nx = a[i].y, ny = -a[i].x;
            char nch;
            if (a[i].ch == 'U') nch = 'R';
            else if (a[i].ch == 'R') nch = 'D';
            else if (a[i].ch == 'D') nch = 'L';
            else nch = 'U';
            a[i].x = nx;
            a[i].y = ny;
            a[i].ch = nch;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        a = new Node[n];
        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            char ch = scan.next().charAt(0);
            a[i] = new Node(x, y, ch);
        }
        long ans = Long.MAX_VALUE;
        for (int k = 0; k < 4; k++) {
            ans = Math.min(ans, process1());
            rotate();
        }
        ans = Math.min(ans, process2());
        rotate();
        ans = Math.min(ans, process2());
        if (ans == Long.MAX_VALUE) System.out.println("SAFE");
        else System.out.println(ans);
    }
}
