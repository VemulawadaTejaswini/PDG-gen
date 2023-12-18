import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static HashMap<Integer, ArrayList<Integer>> map;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        map = new HashMap<Integer, ArrayList<Integer>>();
        for (int i = 1; i <= N; i++) map.put(i, new ArrayList<Integer>());
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            map.get(a).add(b);
            map.get(b).add(a);
        }
        int ans = 0;
        for (int i = 1; i <= N; i++) {
            ans += dfs(i, i, 0);
        }
        System.out.println(ans);
        sc.close();

    }

    private static int dfs(int start, int cur, int step) {
        int ret = 0;
        for(int i = 0; i < map.get(cur).size(); i++){
            int x = map.get(cur).get(i);
            if(x == start) continue;
            if(step < 2){
                ret += dfs(start, x, step +1);
            }else{
                if(!map.get(x).contains(start)){
                    ret++;
                    map.get(x).add(start);
                    map.get(start).add(x);
                }
            }
        }

        return ret;
    }

}
