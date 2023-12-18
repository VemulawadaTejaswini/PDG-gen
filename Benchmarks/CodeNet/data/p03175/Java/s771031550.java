import java.io.*;
import java.util.*;
public class Main {
    
    //long[0] = number of ways this node is white
    //long[1] = number of ways this node is black
    static long[] dfs(HashMap<Integer, ArrayList<Integer>> gh, int node, int parent) {
        long white = 1;
        long black = 1;
        // System.out.println("calling for " + node + " p " + parent);
        for(int v : gh.get(node)) {
            if(v != parent) {
                long[] res = dfs(gh, v, node);
                white = (white*(res[0]+res[1]))%MOD;
                black = (black* res[0])%MOD;
            }
        }
        long[] ret = new long[]{white, black};
        // System.out.println("for " + node + " p " + parent + " = " + Arrays.toString(ret));
        return ret;
    }
    static long MOD = 1000*1000*1000 + 7;
    public static void main(String args[]) {
        int n = 0;
        HashMap<Integer, ArrayList<Integer>> gh = new HashMap();
        try (Scanner scanner = new Scanner(System.in)) {
            n = scanner.nextInt();
            for(int i = 0; i < n - 1 ;i++) {
                final int v1 = scanner.nextInt();
                final int v2 = scanner.nextInt();
                gh.compute(v1, (k, v) -> {
                   if(v == null)
                        v = new ArrayList();
                    v.add(v2);
                    return v;
                });
                
                gh.compute(v2, (k, v) -> {
                  if(v == null)
                        v = new ArrayList();
                    v.add(v1);
                    return v;
                });
            }
        }
        if(gh.size() == 0){
            System.out.println(2);
            return;
        }
        long[] ret = dfs(gh, 1, -1);
        System.out.println((ret[0] + ret[1])%MOD);
    }
    
}