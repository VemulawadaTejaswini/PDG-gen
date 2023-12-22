import java.text.DecimalFormat;
import java.util.*;

public class Main {
    static int n = 0;
    static Set<Integer>[] paths = null;
    static int m = 0;
    static int[] a = null;
    static int[] b = null;
    static int[] depths = null;
    static int[] parents = null;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        paths = new Set[n+1];
        for(int i=1; i<=n; i++) {
            paths[i] = new HashSet<>();
        }
        m = in.nextInt();
        a = new int[m];
        b = new int[m];
        for(int i=0; i<m; i++) {
            a[i] = in.nextInt();
            b[i] = in.nextInt();
            paths[a[i]].add(b[i]);
            paths[b[i]].add(a[i]);
        }
        
        depths = new int[n+1];
        parents = new int[n+1];
        Queue<Integer> bfsQueue = new LinkedList<>();
        bfsQueue.add(1);
        while(bfsQueue.size()>0) {
            int target = bfsQueue.poll();
            int depth = depths[target];
            Iterator<Integer> childrenIT = paths[target].iterator();
            while(childrenIT.hasNext()) {
                int child = childrenIT.next();
                if(depths[child]>0 && depths[child]<=depth) {
                    continue;
                }
                depths[child] = depth+1;
                parents[child] = target;
                bfsQueue.add(child);
            }
            
        }
        
        System.out.println("Yes");
        for(int i=2; i<=n; i++) {
            System.out.println(parents[i]);
        }
    }
}
