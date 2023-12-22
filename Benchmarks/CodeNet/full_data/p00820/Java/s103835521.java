import java.util.*;

public class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            if(n==0) break;

            int ans = rec(n,0,(int)Math.sqrt(n));
            System.out.println(ans);
        }
    }

    int rec(int num, int cnt, int x){
        if(num==0) return 1;
        if(cnt>=4) return 0;

        int res = 0;
        for(int i=x; i>=1; i--){
            if(num-i*i>=0) {
                res += rec(num-i*i,cnt+1,i);
            }
        }

        return res;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}