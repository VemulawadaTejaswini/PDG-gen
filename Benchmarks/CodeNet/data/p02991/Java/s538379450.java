import java.util.*;

public class Main {


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        List[] e = new List[n];
        for(int i=0; i<n; i++) {
            e[i] =  new ArrayList<Integer>();
        }
        for(int i=0; i<m; i++) {
            int u = sc.nextInt() -1;
            int v = sc.nextInt() -1;
            e[u].add(v);
        }
        int s = sc.nextInt() -1;
        int t = sc.nextInt() -1;

        boolean[] v = new boolean[n * 3];
        int[] d = new int[n * 3];
        Arrays.fill(d, Integer.MAX_VALUE);

        Queue<Integer> q = new LinkedList<>();
        q.add(s * 3);
        d[s * 3] = 0;
        v[s*3] = true;
        while(!q.isEmpty()) {
            int a = q.poll();
            int node = a / 3;
            int rem = a % 3;
            int nr = (rem + 1) % 3;
            for(int next : (List<Integer>)e[node]) {
                int na = next * 3 + nr;
                if(v[na]) continue;
                v[na] = true;
                d[na] = Math.min(d[na], d[a] + 1);
                q.add(na);
                if(na == t * 3) {
                    System.out.println(d[na] / 3);
                    return;
                }
            }
        }
        System.out.println(-1);
    }

}
