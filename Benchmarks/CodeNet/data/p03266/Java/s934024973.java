import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        int cnt = N / K;
        long ans = cnt * cnt * cnt;
        
        if(  K % 2 == 0 ){
            int cnt2 = 0;
            int i = 1;
            while( K * i / 2 <= N ){
                i += 2;
                cnt2++;
            }
            
            ans += cnt2 * cnt2 * cnt2;
        }
        
        System.out.println(ans);
    }
}
