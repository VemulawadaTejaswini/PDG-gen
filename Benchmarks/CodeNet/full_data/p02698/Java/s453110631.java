import java.util.*;

public class Main {
    static int n = 0;
    static long[] a = null;
    static Set<Integer>[] vertices = null;
    static int[] results = null;
    static Set<Integer> visited = null;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        a = new long[n];
        for(int i=0; i<n; i++) {
            a[i] = in.nextLong();
        }
        
        vertices = new Set[n];
        for(int i=0; i<n; i++) {
            vertices[i] = new HashSet<>();
        }
        for(int i=0; i<n-1; i++) {
            int u = in.nextInt()-1;
            int v = in.nextInt()-1;
            vertices[u].add(v);
            vertices[v].add(u);
        }
        
        results = new int[n];
        List<Integer> list = new ArrayList<>();
        list.add(0);
        visited = new HashSet<>();
        dfs(list);
        for(int i=0; i<n; i++) {
            System.out.println(results[i]);
        }
    }
    private static void dfs(List<Integer> pastPath) {
        int currentNode = pastPath.get(pastPath.size()-1);
        visited.add(currentNode);
        eval(pastPath);
        Set<Integer> children = vertices[currentNode];
        Iterator<Integer> it = children.iterator();
        while(it.hasNext()) {
            int child = it.next();
            if(visited.contains(child)) {
                continue;
            }
            List<Integer> clone = new ArrayList<>(pastPath);
            clone.add(child);
            dfs(clone);
        }
    }
    private static void eval(List<Integer> pastPath) {
        int longest = 1;
        int current = 1;
        int prevNode = pastPath.get(0);
        long prevValue = a[prevNode];
        for(int i=1; i<pastPath.size(); i++) {
            int curNode = pastPath.get(i);
            long curValue = a[curNode];
            if(prevValue < curValue) {
                current++;
            }
            else {
                longest = Math.max(longest, current);
                current = 1;
            }
            prevNode = curNode;
            prevValue = curValue;
        }
        longest = Math.max(longest, current);
        results[prevNode] = longest;
    }
}
