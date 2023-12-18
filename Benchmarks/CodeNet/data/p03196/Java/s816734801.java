import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long p = sc.nextLong();
        sc.close();

        if(n == 1){
            System.out.println(p);
            return;
        }

        int mn = 1000100;
        int[] num = new int[mn];
        int cur = 2;
        while(p >= cur){
            if(p % cur == 0){
                p /= cur;
                num[cur]++;
            }else{
                cur++;
            }
            if(cur >= mn) break;
        }

        int ans = 1;
        for(int i=1; i<mn; i++){
            if(num[i] >= n){
                ans *= Math.pow(i, (num[i] / n));
            }
        }

        System.out.println(ans);
    }
}