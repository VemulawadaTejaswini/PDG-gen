import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        double ans = 0;
        for(int i = 1; i <= n; i++){
            if(i >= k){
                ans += 1d/(double)n;
                continue;
            }
            int p = n;
            int pow = 1;
            while(i * Math.pow(2,pow) <= k){
                pow += 1;
            }
            ans += 1d/(p*Math.pow(2,pow));
        }
        System.out.println(ans);
    }
}
