import java.util.*;
class Main {
    static int cntX;
    static int cntY;
    static HashMap<Integer, List<Integer>> map;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        map = new HashMap<>();

        for(int i = 0; i<N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt()+100001;
            if(!map.containsKey(x)) {
                map.put(x, new ArrayList<>());
            }
            if(!map.containsKey(y)) {
                map.put(y, new ArrayList<>());
            }
            map.get(x).add(y);
            map.get(y).add(x);
        }

        visited = new boolean[100001*2];
        long ans = 0;
        for(int i = 0; i<100001; i++) {
            cntX = 0;
            cntY = 0;
            dfs(i);
            ans += cntX*cntY;
        }

        System.out.println(ans-N);

    }
    public static void dfs(int x) {
        if(visited[x]) return;
        visited[x] = true;
        if(x<100001) cntX++;
        else cntY++;
        if(map.containsKey(x)) {
            for(int i: map.get(x)) {
                dfs(i);
            }
        }
    }
}