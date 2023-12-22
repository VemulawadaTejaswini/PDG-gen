import java.util.*;

public class Main{

    //int[][] memo;
    int[] square;

    void solve(){
        Scanner sc = new Scanner(System.in);

        //memo = new int[100000][5];
        //for(int i=0; i<=(2^15); i++) Arrays.fill(memo[i],-1);
        square = new int[(int)Math.sqrt(32768)+1];
        for(int i=0; i<square.length; i++) square[i] = i*i;

        while(true){
            int n = sc.nextInt();
            if(n==0) break;

            int ans = rec(n,0,(int)Math.sqrt(n));
            System.out.println(ans);
        }
    }

    int rec(int num, int cnt, int x){
        //if(memo[num][cnt]!=-1) return memo[num][cnt];
        if(num==0) return 1;
        if(cnt>=4) return 0;

        int res = 0;
        for(int i=x; i>=1; i--){
            if(num-square[i]>=0) {
                res += rec(num-square[i],cnt+1,i);
            }
        }

        return res;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}