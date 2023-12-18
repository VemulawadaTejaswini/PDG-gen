import java.util.*;

class Main {
    private static int N, K;
    private static List<List<Integer>> vec;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        vec = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            vec.add(new ArrayList<>());
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(sc.next()) - 1;
            if (i != 0) {
                (vec.get(a)).add(i);
            }else {
                if (a != 0) {
                    ans++;
                }
            }
        }
        ans += dfs(0, 0);


        System.out.println(ans);
    }
    private static int dfs(int i, int now){
        int memo = 0;
        if (now == K + 1) {
            memo++;
            now = 1;
        }
        for (int j = 0; j < (vec.get(i)).size(); j++) {
            memo += dfs((vec.get(i)).get(j), now+1);
        }
        return memo;
    }
}