import java.math.BigDecimal;
import java.util.*;

class Main{
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.close();

        int max_coin = 1;
        while((2 << max_coin)/2 < K){
            max_coin++;
        }
        int bunbo = 2 << (max_coin-1);
        int result_tmp = 0;
        for(int i=1;i<=N;i++){
            if(i>K-1){
                result_tmp += ((2 << max_coin)/2 * (N-K+1));
                break;
            }
            int count = 1;
            while(i * (2 << count)/2 < K){
                count++;
            }
            result_tmp += (2 << (max_coin-count))/2;
        }
        BigDecimal res = new BigDecimal(result_tmp);
        BigDecimal res2 = new BigDecimal(N);
        BigDecimal res3 = new BigDecimal(2<<(max_coin-1));
        res = res.divide(res2.multiply(res3));
        System.out.println(String.format("%.10f", res));
    }
}