import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        cache.clear();
        //System.out.println(dp("WWRR", 0, "WWRR".length()-1));
        System.out.println(dp(s, 0, s.length()-1));
        /*long N = scanner.nextInt(),ans=0,i;
        //N*X -> 7*10^3+7*10^2+7*10^1+7 => 7(10^3+10^2+10^1+1) => 7(1 + 10*(10^2+10+1)) => 7(1+10+ 100*(10^2+10+1))
                                                                //7(1+10(1+10*(1+10*(1+10*())))

        if (N%7==0)
            N/=7;
        if (N%2==0) {
            System.out.println("-1");
            return;
        }

        //factor of 7?
        long cum = 0;
        for (int j = 1; j < N+10; j++) {
            cum = cum*10L+1;
            if (cum>N)
                cum=cum%N;
            if (cum==N || cum==0) {
                System.out.println(j);
                return;
            }
        }
        System.out.println("-1");
        /*
        7(1)
         7 + 10 * 7
            7 + 10 * 7 + 700
                1 + 10 + 100
         **/
        //10^x-1/9 = N*X/7, 10^x = N*X*9/7+1  =>
        //N*X => 0, 7, 7*11 , 7 * 111
        //BigInteger num = new BigInteger("7"), N1 = new BigInteger(N+""), N2 = BigInteger.ONE;
        /*for (i = 1; i <= N&&N%2==1; i++) {
            if (num.mod(N1).equals(BigInteger.ZERO))
                break;
            N2=N2.multiply(BigInteger.TEN).add(BigInteger.ONE);
            num=num.multiply(N2);
        }
        System.out.println((i==N+1||N%2==0)?"-1":i);*/
    }

    static Map<String, Integer> cache = new HashMap<>();
    private static int dp(String s, int i, int i1) {
        //System.out.println(s + "\t" + i + "\t" + i1);
        if (i>=i1)return 0;
        if (s.charAt(i)=='R')
            return dp(s, i+1,i1);
        if (s.charAt(i1)=='W')
            return dp(s, i,i1-1);
        String key = i + " " + i1;
        if (cache.containsKey(key))
            return cache.get(key);
        int ans = Math.min(
                1+dp(s, i+1,i1-1),
                1+dp(s, i,i1-1)
        );
        cache.put(key, ans);
        return ans;
    }

}
