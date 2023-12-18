
import java.util.*;


public class Main {

    private static final int INF = 1000000007;
    private static final int INF1 = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextInt();
        long r = sc.nextInt();

        long result = INF1;
        if((l <= 2019 && 2019 <= r)){
            result = 0;
        }else if(r < 2019) {
            result = (r*(r-1)) % 2019;
        } else if(l > 2019) {
            long waru = l / 2019;
            long warur = r / 2019;
            if(waru < warur){
                result = 0;
            }else{

                long small = waru * 2019;
                long big = (waru + 1) * 2019;

                long bigdiff = big - r;
                long smalldiff = l - small;
                if(bigdiff > smalldiff){
                    result = (l*(l+1)) % 2019;
                }else{
                    result = (r*(r -1)) % 2019 < (l*(l+1)) % 2019 ? (r*(r -1)) % 2019 : (l*(l+1)) % 2019;
                }

            }

        }

        System.out.println(result);

    }
}
