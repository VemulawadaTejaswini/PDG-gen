import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = sc.nextInt();
        int end = sc.nextInt();
        int[] startCosts = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            if (i == start) {
                continue;
            }
            startCosts[i] = getValue(start, i, sc);
        }
        int[] endCosts = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            if (i == end) {
                continue;
            }
            endCosts[i] = getValue(end, i, sc);
        }
        ArrayList<Path> org = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (startCosts[i] + endCosts[i] == startCosts[end]) {
                org.add(new Path(i, startCosts[i]));
            }
        }
        Collections.sort(org);
        Path prev = org.get(0);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(start);
        for (int i = 1; i < org.size(); i++) {
            Path next = org.get(i);
            int value = getValue(prev.idx, next.idx, sc);
            if (value == startCosts[next.idx] - startCosts[prev.idx]) {
                list.add(next.idx);
                prev = next;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("!");
        for (int x : list) {
            sb.append(" ").append(x);
        }
        System.out.println(sb);
        System.out.flush();
    }
    
    static int getValue(int from, int to, Scanner sc) {
        StringBuilder sb = new StringBuilder();
        sb.append("? ").append(from).append(" ").append(to);
        System.out.println(sb);
        System.out.flush();
        int x = sc.nextInt();
        if (x == -1) {
            System.exit(0);
        }
        return x;
    }
    
    static class Path implements Comparable<Path> {
        int idx;
        int value;
        
        public Path(int idx, int value) {
            this.idx = idx;
            this.value = value;
        }
        
        public int compareTo(Path another) {
            return value - another.value;
        }
    }
}

