import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        int cnt = N / K;
        long ans = cnt * cnt * cnt;
        
        if(  K % 2 == 0 ){
            int cnt2 = 1;
            while( K * cnt2 / 2 <= N ){
                cnt2 += 2; 
            }
            
            cnt2 /= 2;
            ans += cnt2 * cnt2 * cnt2;
        }
        
        System.out.println(ans);
    }
}
