import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    private static final boolean[] pc = createPrimeChecker();
    private static final int MAX = 1000000;
    
    public static void main(String[] args) {
        while(scn.hasNextInt()) {
            System.out.println(countPrime(scn.nextInt()));
        }
    }
    
    private static boolean[] createPrimeChecker() {
        boolean[] ary = new boolean[MAX];
        ary[2] = true;
        for(int i = 3; i < MAX; i += 2) {
            ary[i] = !ary[i];
        }
        for(int i = 3; i <= Math.sqrt(MAX); i += 2) {
            if(ary[i]) {
                for(int j = i * 2; j < MAX; j += i) {
                    ary[j] = false;
                }
            }
        }
        return ary;
    }
    
    private static int countPrime(int n) {
        int cnt = n > 1 ? 1 : 0;
        for(int i = 3; i <= n; i += 2) {
            cnt += pc[i] ? 1 : 0;
        }
        return cnt;
    }
}