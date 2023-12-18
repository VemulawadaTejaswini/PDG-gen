import java.util.*;
import java.math.*;

public class Main {
    static final int MOD = 1_000_000_007; // 10^9+7
    // static final int MAX = 2_147_483_646; // intの最大値
    static final int INF = 1_000_000_000; // 10^9
    static final int MAX = 10_000_000;
    static long[] fact = new long[100];
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] height = new int[n];
        int[] ary = new int[m];
        int[] bry = new int[m];
        for(int i = 0;i < n;i++){
            height[i] = sc.nextInt();
        }
        node = new List[n];
        for(int i = 0;i < n;i++){
            node[i] = new ArrayList<Integer>();
        }
        for(int i = 0;i < m;i++){
            ary[i]= sc.nextInt();
            bry[i] = sc.nextInt();
            add(ary[i]-1, bry[i]-1);
        }
        //一番高い展望台or辿り着ける展望台がない:よい
        int ans = 0;       
        for(int i = 0;i < n;i++){
            if(node[i].size()==0){
                ans++;
                continue;
            }
            for(int j = 0;j < node[i].size();j++){
                if(height[i]<=height[(int)node[i].get(j)]){
                    ans--;
                    break;
                }
            }
            ans++;
        } 
        System.out.println(ans);
    }
    public static List[] node;
    static void add(int i,int j){
        if(i==j)return;
        node[i].add(j);
        node[j].add(i);
    }
    
}
