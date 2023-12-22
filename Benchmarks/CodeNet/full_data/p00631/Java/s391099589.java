import java.util.*;

public class Main {
    
    static int dfs(int[] p, int a, int b, int i){
        if(i == p.length){
            return Math.abs(a - b);
        }else{
            int ans1 = dfs(p, a + p[i], b, i + 1);
            int ans2 = dfs(p, a, b + p[i], i + 1);
            return Math.min(ans1, ans2);
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n == 0) break;
            int[] p = new int[n];
            for(int i = 0; i < n; i++){
                p[i] = sc.nextInt();
            }
            int ans = dfs(p, 0, 0, 0);
            System.out.println(ans);
        }
    }
}

