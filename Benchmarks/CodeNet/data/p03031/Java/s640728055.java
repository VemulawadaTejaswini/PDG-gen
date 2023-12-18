import java.util.*;

class Main{
    final static long mod = 1000000007;
    //
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[][] connection = new boolean[m][10];
        for(int i = 0; i < m; i++){
            int k = sc.nextInt();
            for(int j = 0; j < k; j++){
                connection[i][sc.nextInt() - 1] = true;
            }
        }
        int[] nums = new int[m];
        for(int i = 0; i < m; i++) nums[i] = sc.nextInt();
        int cnt = 0;
        for(int i = 0; i < (1 << n); i++){
            int on = 0;
            boolean[] swi = new boolean[10];
            for(int j = 0; j < 10; j++){
                if((i >> j & 1) == 1){
                    swi[j] = true;
                }
            }
            for(int j = 0; j < m; j++){
                int on_cnt = 0;
                for(int k = 0; k < 10; k++){
                    if(swi[k] && connection[j][k]) on_cnt++;
                }
                if(on_cnt % 2 == nums[j]) on++;
            }
            if(on == m) cnt++;
        }
        System.out.println(cnt);
    }
}