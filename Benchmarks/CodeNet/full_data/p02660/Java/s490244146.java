import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long N = Long.parseLong(sc.next());
        long n = N;
        int ans = 0;
        ArrayList<Long> list = new ArrayList<>();
        if(N == 1) {
            ans = 0;
        }else {
            for(long i=2; i<=Math.sqrt(N); i++) {
                if(n % i == 0) {
                    n /= i;
                    list.add(i);
                    ans++;
                    long k = i;
                    while(true) {
                        k *= i;
                        if(n % k == 0) {
                            list.add(k);
                            n /= k;
                            ans++;
                        }else {
                            break;
                        }
                    }
                }
            }
            if(n > 1) {
                ans++;
            }
            
        }
        System.out.println(ans);
    }
}
