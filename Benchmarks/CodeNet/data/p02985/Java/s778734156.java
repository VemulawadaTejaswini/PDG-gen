import java.util.*;

public class Main{

    static Scanner sc = new Scanner(System.in);

    static int n = sc.nextInt();
    static int k = sc.nextInt();

    static int mod = (int)1e9 + 7 ;
    static Map<Integer, Set<Integer>> edge;

    static boolean visit[] = new boolean[n];



    public static void main(String args[]){

        edge = new HashMap<>();
        for (int i=0; i<n; i++){
            edge.put(i, new HashSet<>());
        }
        visit[0] = true;

        for (int i=0; i<n-1; i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;

            edge.get(a).add(b);
            edge.get(b).add(a);
        }

        System.out.println(bfs(0,0,0));



    }

    private static int bfs(int v, int parent, int other) {
        int d = 0;
        int r = k - parent - other;
        for (int i : edge.get(v)) {
            if (!visit[i]) {
                visit[i] = true;
                r = (r * bfs(i, 1, parent + d))%mod;
                d++;
            }
        }
        return r;
    }
}