import java.util.*;
//Keyword: bfs
class Main{
    static List<Integer>[] path;
    static int n;
    static boolean[] seen;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int m = scanner.nextInt();
        path = new ArrayList[n+1];
        for (int x=0; x<=n; x++) {
            path[x] = new ArrayList<Integer>();
        }
        for(int i = 0; i < m; i++){
            int one = scanner.nextInt();
            int two = scanner.nextInt();
            path[one].add(two);
            path[two].add(one);
        }
        int count = 0;
        for(int i = 1; i <= n; i++){
            for(int j = i+1; j <= n; j++){
                if(path[i].contains(j)){
                    seen = new boolean[n+1];
                    dfs(i,j,1);
                    boolean flag = true;
                    for(int k = 1; k <= n; k++){
                        if(seen[k] == false){flag = false;}
                    }
                    if(!flag){count++;}
                }
            }
        }
        System.out.println(count);
    }

    public static void dfs(int a, int b, int cur){
        seen[cur] = true;
        for(int i = 0; i < path[cur].size(); i++){
            int next = path[cur].get(i);
            if(!seen[next] && !(a == Math.min(cur, next) && b == Math.max(cur,next))){
                dfs(a,b,next);
            }
        }
    }
}

